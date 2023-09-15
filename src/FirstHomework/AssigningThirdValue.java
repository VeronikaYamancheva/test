package FirstHomework;

import java.util.Scanner;
//Задание 1.7. Присваивание переменной х целочисленное
//значение, а затем присваиваание переменной у треть
//значения переменной х
public class AssigningThirdValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        float y = (float) x / 3;
        System.out.println(y);
    }

}
