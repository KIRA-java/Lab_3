package Task6;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while(true) {
            System.out.print("Введите размер массива (целое положительное число, n > 0 ): ");
            n = scanner.nextInt();
            if (n > 0) {
                scanner.close();
                break;
            }
        }
        // Создаем массив
        int[] arr = new int[n];
        // Заполняем: i-й элемент = 5*i + 2 (при i = 0 → 2, i = 1 → 7, ...)
        for (int i = 0; i < n; i++) {
            arr[i] = 5 * i + 2;
        }
        // Выводим массив
        System.out.println("✅ Массив заполнен числами, дающими остаток 2 при делении на 5:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
    }
}
