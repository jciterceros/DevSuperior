import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Department dept = new ...
        // ...
        showReport(dept);
        sc.close();
    }

    private static void showReport(Department dept) {
        // MOSTRAR NA TELA OS DADOS DO RELATÓRIO
    }
}
