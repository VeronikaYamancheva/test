package FirstHomework;//Задание 11.13 вывод трехзначных чисел в убывающем порядке

public class DescendingSequenceOutput {
    public static void main(String[] args) {
        System.out.println("начало");
        for (int i = 999; i >= 100; i--){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("завершено");
    }
}
