import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double salario = sc.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double prestacaoServico = sc.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double ganhoCapital = sc.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = sc.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = sc.nextDouble();

        double rendaMensal = salario / 12;
        double impostoFinal = 0.0;

        double impostoSalario = 0.0;
        if (rendaMensal < 3000) {
            impostoSalario = 0.0;
        } else if (rendaMensal < 5000) {
            impostoSalario = (rendaMensal * 0.1) * 12;
        } else {
            impostoSalario = (rendaMensal * 0.2) * 12;
        }
        impostoFinal += impostoSalario;

        double impostoPrestacaoServico = 0.0;
        if (prestacaoServico > 0) {
            impostoPrestacaoServico += prestacaoServico * 0.15;
        }
        impostoFinal += impostoPrestacaoServico;

        double impostoGanhoCapital = 0.0;
        if (ganhoCapital > 0) {
            impostoGanhoCapital += ganhoCapital * 0.2;
        }
        impostoFinal += impostoGanhoCapital;

        double gastosDedutiveis = 0.0;
        if (gastosMedicos > 0) {
            gastosDedutiveis += gastosMedicos;
        }
        if (gastosEducacionais > 0) {
            gastosDedutiveis += gastosEducacionais;
        }

        double maximoDedutivel = 0.0;
        double abatimento = gastosDedutiveis;
        if (abatimento > impostoFinal * 0.3) {
            maximoDedutivel = impostoFinal * 0.3;
            abatimento = maximoDedutivel;
        } else {
            maximoDedutivel = impostoFinal * 0.3;
        }

        System.out.println("");
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println();
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f%n", impostoPrestacaoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhoCapital);
        System.out.println();
        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
        System.out.println();
        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", impostoFinal);
        System.out.printf("Abatimento: %.2f%n", abatimento);
        System.out.printf("Imposto devido: %.2f%n", impostoFinal - abatimento);

        sc.close();
    }
}
