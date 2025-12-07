package task_1068;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        long a = Math.min(1, N);
        long b = Math.max(1, N);
        long count = b - a + 1;
        long sum = (a + b) * count / 2;

        System.out.println(sum);

    }
}
