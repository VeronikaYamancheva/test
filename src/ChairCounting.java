import java.util.Scanner;
public class ChairCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int chairs = scanner.nextInt();
        if (students < chairs) {
            System.out.println(chairs - students + " стульев лишние");
        } else if (students > chairs) {
            System.out.println(students - chairs + " стульев нехватает");
        } else {
            System.out.println("кол-во стульев и учеников одинаково");
        }
    }
}
