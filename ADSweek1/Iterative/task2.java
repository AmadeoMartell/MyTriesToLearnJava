package ADSweek1.Iterative;

import java.util.Scanner;


public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int num = scanner.nextInt();
        System.out.println("Enter all elements of array: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Average: " + findAVG(num, arr));
    }
    public static float findAVG(int num, int[] arr){
        float sum = 0;
        for (Integer iter: arr){
            sum += iter;
        }
        return ((float) sum/ num);
    }
}
