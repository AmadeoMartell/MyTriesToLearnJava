package day4;

import java.util.Arrays;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(10000);
        int max = array[0];
        int min = array[0];
        for (int iter: array) {
            if (iter > max) max = iter;
            else if (iter < min) min = iter;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max el: " + max);
        System.out.println("Min el: " + min);
        System.out.println("The count of array elements ending in 0: " + Arrays.stream(array).filter(s -> s % 10 == 0).count());
        System.out.println("The sum of array elements ending in 0: " + Arrays.stream(array).filter(s -> s % 10 == 0).sum());

    }
}
