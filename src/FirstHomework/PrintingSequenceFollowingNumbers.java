package FirstHomework;//Задание 2.21. Вывести 3 следующий числа за введенным с клавиатуры

import java.util.Scanner;

public class PrintingSequenceFollowingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x + 1);
        System.out.println(x + 2);
        System.out.println(x + 3);

    }
}
