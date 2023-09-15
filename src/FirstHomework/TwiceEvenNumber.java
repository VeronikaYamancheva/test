package FirstHomework;// Задание 8.17. проверка числа на дважды четное

import java.util.Scanner;

public class TwiceEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = x;
        int summ = 0;
        while (x > 0) {
            summ += (x % 10);
            x = x / 10;
        }
        if ((summ % 2) + (count % 2) == 0) {
            System.out.println("число дважды четное");
        } else {
            System.out.println("число не является дважды четным");
        }
    }
}
