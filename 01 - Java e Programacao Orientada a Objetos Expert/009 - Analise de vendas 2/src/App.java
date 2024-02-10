import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Sale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre o caminho do arquivo: ");
        String path = sc.nextLine();

        List<Sale> sales = new ArrayList<>();

        try {
            File file = new File(path);
            Scanner fileSc = new Scanner(file);

            while (fileSc.hasNextLine()) {
                String[] fields = fileSc.nextLine().split(",");
                if (fields.length == 5) {
                    Integer month = Integer.parseInt(fields[0]);
                    Integer year = Integer.parseInt(fields[1]);
                    String seller = fields[2];
                    Integer items = Integer.parseInt(fields[3]);
                    Double total = Double.parseDouble(fields[4]);

                    Sale sale = new Sale(month, year, seller, items, total);
                    sales.add(sale);
                } else {
                    System.out.println("Invalid number of fields = " + fields.length);
                }
            }
            fileSc.close();

            // Encontrar as cinco primeiras vendas de 2016 com o maior preço médio
            System.out.println("");
            System.out.println("Cinco primeiras vendas de 2016 de maior preço médio");
            sales.stream()
                    .filter(sale -> sale.getYear() == 2016)
                    .sorted(Comparator.comparingDouble(Sale::averagePrice).reversed())
                    .limit(5)
                    .forEach(sale -> System.out
                            .println(sale.toString() + ", pm = " + String.format("%.2f", sale.averagePrice())));
            System.out.println("");

            // Calcular o valor total vendido pelo vendedor Logan nos meses 1 e 7
            double totalLogan = sales.stream()
                    .filter(sale -> sale.getSeller().equals("Logan") && (sale.getMonth() == 1 || sale.getMonth() == 7))
                    .mapToDouble(Sale::getTotal).sum();
            // .map(Sale::getTotal).reduce(0.0, (x, y) -> x + y);
            System.out.println("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = " + totalLogan);

        } catch (FileNotFoundException e) {
            System.out.printf("Erro: %s (O sistema não pode encontrar o arquivo especificado)", path);
        } finally {
            sc.close();
        }
    }
}