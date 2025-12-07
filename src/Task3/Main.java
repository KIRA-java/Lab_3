package Task3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Количество должно быть положительным.");
        } else {
            int a = 1, b = 1;
            System.out.println("Последовательность Фибоначчи: ");
            System.out.println("for: ");
            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    System.out.print(a);
                } else if (i == 2) {
                    System.out.print(" " + b);
                } else {
                    int next = a + b;
                    System.out.print(" " + next);
                    a = b;
                    b = next;
                }
            }
            System.out.println();

            System.out.println("while: ");
            a = b = 1;
            int count = 1;

            while (count <= n) {
                if (count == 1) {
                    System.out.print(a);
                } else if (count == 2) {
                    System.out.print(" " + b);
                } else {
                    int next = a + b;
                    System.out.print(" " + next);
                    a = b;
                    b = next;
                }
                count++;

            }
            System.out.println();

            System.out.println("do {...} while: ");
            a = b = count = 1;
            do {
                if (count == 1) {
                    System.out.print(a);
                } else if (count == 2) {
                    System.out.print(" " + b);
                } else {
                    int next = a + b;
                    System.out.print(" " + next);
                    a = b;
                    b = next;
                }
                count++;
            } while (count <= n);
            System.out.println();
        }
    }
}
