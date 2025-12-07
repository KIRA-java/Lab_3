package Task5;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммирования: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Количество должно быть положительным.");
            return;
        }

        int count = 0;      // сколько подходящих чисел уже найдено
        int x = 1;          // текущее проверяемое число (начинаем с 1)
        int sum = 0;
        System.out.println("Подходящие числа: ");
        System.out.print("while: ");
        while (count < n) {
            if (x % 5 == 2 || x % 3 == 1) {
                System.out.print(x);
                sum += x;
                count++;
                if (count < n) System.out.print(", ");
            }
            x++;
        }
        System.out.println();
        System.out.println("Сумма: " + sum);

        count = sum = 0;
        System.out.print("for: ");
        for (x = 1; ; x++) {
            if (x % 5 == 2 || x % 3 == 1) {
                System.out.print(x);
                sum += x;
                count++;
                if (count == n) {
                    break;
                }
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Сумма: " + sum);

        count = sum = 0;
        x = 1;
        System.out.print("do {} while: ");
        do {
            if (x % 5 == 2 || x % 3 == 1) {
                System.out.print(x);
                sum += x;
                count++;
                if (count < n) System.out.print(", ");
            }
            x++;
        } while (count < n);

        System.out.println();
        System.out.println("Сумма: " + sum);
    }
}
