package Task9;

import java.util.Random;

public class Main {
    static void main() {
        // Настройки
        int size = 15;
        // Создание и заполнение массива случайными числами
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
        }
        // Вывод массива
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();

        // Шаг 1: найти минимальное значение
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Шаг 2: собрать все индексы, где arr[i] == min
        System.out.println("Минимальное значение: " + min);
        System.out.print("Индекс значения: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                System.out.print(i);
                if (i < arr.length - 1) System.out.print(", ");
            }
        }
        System.out.println();
    }
}
