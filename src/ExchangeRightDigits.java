// Задание 4.24. обмен правыми цифрами двух трехзначных чисел

import java.util.Scanner;

public class ExchangeRightDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int xx = x % 10;
        int yy = y % 10;
        x = x / 10;
        y = y / 10;
        x = x * 10 + yy;
        y = y * 10 + xx;
        System.out.println(x + " " + y);
    }
}
