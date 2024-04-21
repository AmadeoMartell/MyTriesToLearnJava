package ADSweek1.recursive;

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
        System.out.println("Min number: " + min(0, arr));
    }
    public static int min(int step, int[] array){
        if (step == array.length - 1) return array[step];
        int next = min(step + 1, array);
        if (array[step] < next) return array[step];
        else return next;
    }
}

// min(1, min(2, min(3...))))
//    public static int min(int step, int[] array, int temp_min){
//        if (step == array.length) return temp_min;
//        if (array[step] < temp_min){
//            temp_min = array[step];
//        }
//        step += 1;
//        return min(step, array, temp_min);
//    }

