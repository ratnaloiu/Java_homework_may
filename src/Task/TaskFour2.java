// Задача 2 (цикл)

package Task;

import java.util.Scanner;

public class TaskFour2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        int i = 0;
        for (i = 0; n3 < number; i++) {
            n3 = n1 + n2;
            if (n3 < number) {
                System.out.println(n3);
            }
            n1 = n2;
            n2 = n3;


        }
    }
}
