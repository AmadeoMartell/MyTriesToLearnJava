package ADSweek1.recursive;

import java.util.Scanner;

public class task2Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int num = scanner.nextInt();
        System.out.println("Enter all elements of array: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Average: " + findAVG(0, arr, 0));
    }

    public static float findAVG(int step, int[] array, float add) {
        if (step == array.length - 1) return (float) array[step] / array.length + add;
        //float next = findAVG(step + 1, array);
        //return (float) array[step] / array.length + next;
        return findAVG(step + 1, array, add + (float) array[step]/array.length);
    }
}
