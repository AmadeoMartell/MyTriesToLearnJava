package FirstThings;

import java.util.Scanner;

public class FirstArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = 2, b = 4;
        int[][] TwoDimArray = new int[a][b];
        for (int i = 0; i < a; i++){
            System.out.print("Заполните " + (i + 1) + " ряд массива: ");
            for (int j = 0; j < b; j++){
                int temp = input.nextInt();
                TwoDimArray[i][j] = temp * 2;
            }
        }
        System.out.println("Наш массив умноженный на 2: ");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print(TwoDimArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
