//Задание 6.11. проверка знаков двух введенных  чисел

import java.util.Scanner;

public class CheckingNumberSigns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x * y > 0) {
            System.out.println("один и тот же знак");
        } else if (x * y < 0) {
            System.out.println("разные знаки");
        } else {
            System.out.println("некорректно");
        }
    }
}
