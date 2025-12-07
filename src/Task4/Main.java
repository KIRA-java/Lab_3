package Task4;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        scanner.close();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println("Числа в диапазоне: ");
        System.out.print("for: ");
        for (int i = min; i <= max; i++) {
            System.out.print(i);
            if (i < max) System.out.print(" ");
        }
        System.out.println();
        System.out.print("while: ");
        int i = min;
        while (i <= max) {
            System.out.print(i);
            if (i < max) System.out.print(" ");
            i++;
        }
        System.out.println();
        System.out.print("do {} while: ");
        i = min;
        do {
            System.out.print(i);
            if (i < max) System.out.print(" ");
            i++;
        } while (i <= max);
        System.out.println();
    }
}
