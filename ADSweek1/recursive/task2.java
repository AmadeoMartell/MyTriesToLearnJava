package ADSweek1.recursive;

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
        System.out.println("Average: " + findAVG(0, arr));
    }
    public static float findAVG(int step, int[] array){
        if (step == array.length - 1) return (float) array[step] / array.length;
        float next = findAVG(step + 1, array);
        return (float)array[step] / array.length + next;
    }
//    public static float findAVG(int step, int[] arr, int temp_sum){
//        if (step == arr.length) {
//            return (float) temp_sum / arr.length;
//        }
//        temp_sum += arr[step];
//        return findAVG(++step, arr, temp_sum);
//    }
}
