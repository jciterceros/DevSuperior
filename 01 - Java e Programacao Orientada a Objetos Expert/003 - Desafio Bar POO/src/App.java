import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();
        System.out.print("Sexo: ");
        bill.setGender(sc.next().charAt(0));

        System.out.print("Quantidade de cervejas: ");
        bill.setBeer(sc.nextInt());

        System.out.print("Quantidade de refrigerantes: ");
        bill.setSoftDrink(sc.nextInt());

        System.out.print("Quantidade de espetinhos: ");
        bill.setBarbecue(sc.nextInt());

        System.out.println("");
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
        System.out.printf(bill.cover() == 0 ? "Isento de Couvert%n" : "Couvert = R$ %.2f%n", bill.cover());
        System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
        System.out.println("");
        System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());

        sc.close();
    }
}
