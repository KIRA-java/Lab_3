package Task7;

public class Main {
    static void main() {
        int size = 10;
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        // Создаём массив
        char[] arr = new char[size];
        // Заполняем: i-я буква = alphabet.charAt(2 * i)
        for (int i = 0; i < size; i++) {
            arr[i] = alphabet.charAt(2 * i);
        }

        // Вывод в прямом порядке
        System.out.print("Прямой порядок: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();

        // Вывод в обратном порядке
        System.out.print("Обратный порядок: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();
    }
}
