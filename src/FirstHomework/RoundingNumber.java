package FirstHomework;//Задание 8.22. округление для четных чисел вверх,
// для нечетных - вниз

import java.util.Scanner;

public class RoundingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if ((x % 2 == 0) && (x >= 10)){
            System.out.println("Up to " + ((x/10) + 1 ) * 10);
        } else if (x % 2 == 0){
            System.out.println("Up to 10");
        } else {
            System.out.println("Down to " + (x/10) * 10);
        }
    }
}
