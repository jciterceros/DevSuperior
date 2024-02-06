import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();
        List<TaxPayer> taxpayers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("");
            System.out.println("Digite os dados do " + i + "o contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();
            TaxPayer taxpayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending,
                    educationSpending);
            taxpayers.add(taxpayer);
        }
        for (int i = 0; i < taxpayers.size(); i++) {
            TaxPayer taxpayer = taxpayers.get(i);
            System.out.println();
            System.out.println("Resumo do " + (i + 1) + "o contribuinte:");
            System.out.printf("Imposto bruto total: %.2f%n", taxpayer.grossTax());
            System.out.printf("Abatimento:  %.2f%n", taxpayer.taxRebate());
            System.out.printf("Imposto devido:  %.2f%n", taxpayer.netTax());
        }
        sc.close();
    }
}
