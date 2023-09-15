package FirstHomework;//Задание 4.9. вывести вес числа, то есть сумму его цифр

import java.util.Scanner;

public class NumberWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int summ = 0;
        while (x > 0) {
            summ += (x % 10);
            x = x / 10;
        }
        System.out.println(summ);
    }
}
