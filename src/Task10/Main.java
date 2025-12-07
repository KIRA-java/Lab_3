package Task10;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static void main() {
        int size = 12;
        int[] arr = new int[size];
        Random rand = new Random();

        // Заполнение случайными числами (0–99)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Сортировка по возрастанию
        Arrays.sort(arr);
        System.out.println("Сортировка по возростанию: " + Arrays.toString(arr));
        // Сортировка по убыванию
        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Сортировка по убыванию: " + Arrays.toString(arr));
    }
}
