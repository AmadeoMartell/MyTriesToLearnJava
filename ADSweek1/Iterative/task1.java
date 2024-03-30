package ADSweek1.Iterative;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int num = scanner.nextInt();
        System.out.println("Enter all elements of array: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Min number: " + min(num, arr));
    }
    public static int min(int num, int[] array){
        int min_num = array[0];
        for (int i = 1; i < num; i++) {
            if (array[i] < min_num) min_num = array[i];
        }
        return min_num;
    }
}
