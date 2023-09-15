//Задание 6.7. если введенное число трезначное и положительное, убавить на единицу

import java.util.Scanner;

public class ConditionDecreaseByOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 100) {
            x--;
        }
        System.out.println(x);
    }
}
