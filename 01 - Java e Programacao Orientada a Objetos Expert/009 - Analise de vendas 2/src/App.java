import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

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

            // Obter nomes únicos de vendedores usando um conjunto (Set)
            Set<String> uniqueSellers = new HashSet<>();
            for (Sale sale : sales) {
                uniqueSellers.add(sale.getSeller());
            }

            // Calcular o total vendido por cada vendedor usando Stream + lambda
            System.out.println("");
            System.out.println("Total de vendas por vendedor:");
            uniqueSellers.stream().forEach(seller -> {
                double total = sales.stream()
                        .filter(s -> s.getSeller().equals(seller))
                        .mapToDouble(Sale::getTotal)
                        .sum();
                System.out.println(seller + " - R$ " + String.format("%.2f", total));
            });

        } catch (FileNotFoundException e) {
            System.out.printf("Erro: %s (O sistema não pode encontrar o arquivo especificado)", path);
        } finally {
            sc.close();
        }
    }
}