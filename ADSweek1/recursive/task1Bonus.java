package ADSweek1.recursive;

import java.util.Scanner;

public class task1Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int num = scanner.nextInt();
        System.out.println("Enter all elements of array: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Min number: " + min(0, arr, arr[0]));
    }
    public static int min(int step, int[] array, int currentMin) {
        if (step == array.length) return currentMin;
        int tempMin = (array[step] < currentMin) ? array[step] : currentMin;
        return min(step + 1, array, tempMin);
    }
}
