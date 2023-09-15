//Задание 8.15. какая из цифр двузначного числа больше

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int num1 = x % 10;
        int num2 = x / 10;
        if (num1 > num2) {
            System.out.println("вторая цифра больше");
        } else if (num2 > num1) {
            System.out.println("первая цифра больше");
        }
    }
}
