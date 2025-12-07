package Task8;

public class Main {
    static void main() {
        int size = 10;
        char[] arr = new char[size];

        // Начинаем с буквы 'A'
        char current = 'A';
        int index = 0; // сколько букв уже записано в массив

        // Пока не заполним весь массив
        while (index < size) {
            // Пропускаем только 'A', 'E', 'I'
            if (current == 'A' || current == 'E' || current == 'I') {
                current++; // переходим к следующей букве
                continue;  // и пропускаем итерацию
            }

            // Если буква НЕ одна из запрещённых — записываем
            arr[index] = current;
            index++;
            current++;
        }

        // Выводим массив
        System.out.print("Массив согласных (без A, E, I): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
