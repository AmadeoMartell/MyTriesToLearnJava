package day1;

import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int k = random.nextInt(10) + 1;
        System.out.printf("Выбранное число %d для таблицы умножения: %n", k);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d%n", i, k, i*k);
        }
    }
}
