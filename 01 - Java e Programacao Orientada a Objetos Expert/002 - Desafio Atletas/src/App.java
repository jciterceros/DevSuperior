import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int n = sc.nextInt();
        sc.nextLine();

        String nome[] = new String[n];
        char sexo[] = new char[n];
        double altura[] = new double[n];
        double peso[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite os dados do atleta numero %d:%n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            while (nome[i].length() < 3) {
                System.out.print("Nome invalido! Favor digitar um nome com pelo menos 3 caracteres: ");
                nome[i] = sc.nextLine();
            }
            System.out.print("Sexo: ");
            sexo[i] = sc.nextLine().charAt(0);
            while (sexo[i] != 'F' && sexo[i] != 'M') {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo[i] = sc.nextLine().charAt(0);
            }
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            while (altura[i] <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura[i] = sc.nextDouble();
            }
            System.out.print("Peso: ");
            peso[i] = sc.nextDouble();
            while (peso[i] <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso[i] = sc.nextDouble();
            }
            sc.nextLine();
        }

        double pesoMedio = 0;
        for (int i = 0; i < n; i++) {
            pesoMedio += peso[i];
        }
        pesoMedio /= n;

        int posicaoAtletaMaisAlto = 0;
        for (int i = 1; i < n; i++) {
            if (altura[i] > altura[posicaoAtletaMaisAlto]) {
                posicaoAtletaMaisAlto = i;
            }
        }
        String atletaMaisAlto = nome[posicaoAtletaMaisAlto];

        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;
        double alturaMediaMulheres = 0;
        for (int i = 0; i < n; i++) {
            if (sexo[i] == 'M') {
                quantidadeHomens++;
            } else {
                quantidadeMulheres++;
                alturaMediaMulheres += altura[i];
            }
        }

        double porcentagemHomens = (double) quantidadeHomens / n * 100;

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
        System.out.printf("Atleta mais alto: %s%n", atletaMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemHomens);
        if (quantidadeMulheres > 0) {
            alturaMediaMulheres /= quantidadeMulheres;
            System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas");
        }

        sc.close();
    }
}
