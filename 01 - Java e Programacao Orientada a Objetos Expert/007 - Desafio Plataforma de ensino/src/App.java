import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Lesson;
import entities.Task;
import entities.Video;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas aulas tem o curso? ");
        int numLessons = sc.nextInt();
        sc.nextLine();

        List<Lesson> lessons = new ArrayList<>();

        for (int i = 0; i < numLessons; i++) {
            System.out.println("");
            System.out.println("Dados da " + (i + 1) + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char type = sc.nextLine().charAt(0);

            Lesson lesson;
            if (type == 'c') {
                System.out.print("Título: ");
                String title = sc.nextLine();
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int duration = sc.nextInt();
                sc.nextLine();

                lesson = new Video(title, url, duration);

            } else if (type == 't') {
                System.out.print("Título: ");
                String title = sc.nextLine();
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();
                sc.nextLine();

                lesson = new Task(title, description, questionCount);

            } else {
                System.out.println("Tipo inválido! Use 'c' para conteúdo (vídeo) ou 't' para tarefa.");
                continue;
            }

            lessons.add(lesson);
        }
        int totalDuration = calculateTotalDuration(lessons);
        System.out.println("");
        System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");

        sc.close();
    }

    private static int calculateTotalDuration(List<Lesson> lessons) {
        int totalDuration = 0;
        for (Lesson lesson : lessons) {
            totalDuration += lesson.duration();
        }
        return totalDuration;
    }
}
