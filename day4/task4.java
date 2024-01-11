package day4;

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(10000);
        int max = array[0] +  array[1] + array[2], FirstInd = 0;
        for (int i = 0; i < array.length - 2; i++) {
            if(array[i] +  array[i+1] + array[i+2] > max){
                max = array[i] +  array[i+1] + array[i+2];
                FirstInd = i;
            }
        }
        System.out.println(max);
        System.out.println(FirstInd);
    }
}
