package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int[] array = new int[Integer.parseInt(reader.readLine())];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) array[i] = random.nextInt(11);
            System.out.println(Arrays.toString(array));
            int[] infos = new int[4];
            for (int iter: array) {
                if (iter > 8) infos[0]++;
                if (iter == 1) infos[1]++;
                if (iter % 2 == 0) infos[2]++;
                else infos[3]++;
            }
            System.out.println("Информация о массиве:\nДлина массива: " + array.length);
            System.out.println("Количество чисел больше 8: " + infos[0]);
            System.out.println("Количество чисел равных 1: " + infos[1]);
            System.out.println("Количество четных чисел: " + infos[2]);
            System.out.println("Количество нечетных чисел: " + infos[3]);
            System.out.println("Сумма всех элементов массива: " + Arrays.stream(array).sum());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
