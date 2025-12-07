package Task2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название дня недели (с заглавной буквы): ");
        String day = scanner.nextLine().trim().toLowerCase();
        scanner.close();

        System.out.println("if / else if / else: ");
        if (day.equals("понедельник")) {
            System.out.println("1");
        } else if (day.equals("вторник")) {
            System.out.println("2");
        } else if (day.equals("среда")) {
            System.out.println("3");
        } else if (day.equals("четверг")) {
            System.out.println("4");
        } else if (day.equals("пятница")) {
            System.out.println("5");
        } else if (day.equals("суббота")) {
            System.out.println("6");
        } else if (day.equals("воскресенье")) {
            System.out.println("7");
        } else {
            System.out.println("Такого дня недели нет.");
        }

        System.out.println("switch: ");
        String result = switch (day) {
            case "понедельник" -> "1";
            case "вторник" -> "2";
            case "среда" -> "3";
            case "четверг" -> "4";
            case "пятница" -> "5";
            case "суббота" -> "6";
            case "воскресенье" -> "7";
            default -> "Такого дня недели нет.";
        };
        System.out.println(result);
    }
}
