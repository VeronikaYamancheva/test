//Задание 2.19.вывод последовательности, в которую
//входят введенный элемент, элемент на один меньше введенного и на один больше введенного

import  java.util.Scanner;

public class SequenceOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int z = x - 1;
        int y =  x + 1;
        System.out.println(z + " " + x + " " + y);
    }

}
