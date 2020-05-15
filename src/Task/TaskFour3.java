// Задача 3


package TaskFour3;

import java.util.Scanner;

public class TaskFour3 {
    public static void main(String[] args) {
        System.out.println("Введите колличество дней: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Неверное колличество дней");
        }
        if (number >= 1) {
            System.out.println("Введите колличество осадков:");
        }
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int sredneekollosadkov = 0;
        int maxday = 0;
        int maxosadki = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println("День " + i + ":");
            int osadki = scan.nextInt();
            sum = sum + osadki;
            sredneekollosadkov = sum / number;
            if (osadki > maxosadki) {
                maxosadki = osadki;
                maxday = i;
            }


        }
        System.out.println("Колличество дней: " + number);
        System.out.println("Сумма осадков за этот период: " + sum);
        System.out.println("Среднее колличество осадков за этот период: " + sredneekollosadkov);
        System.out.println("Наибольшее колличество осадков: " + maxosadki);
        System.out.println("Наибольшее колличество осадков было в этот день: " + maxday);
    }
}
