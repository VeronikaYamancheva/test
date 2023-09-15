package FirstHomework;//Задание 3.7. вывод трех предыдущих чисел

import java.util.Scanner;

public class OutputPreviousNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x - 1);
        System.out.println(x - 2);
        System.out.println(x - 3);
    }
}
