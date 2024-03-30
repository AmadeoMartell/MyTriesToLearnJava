package ADSweek1.recursive;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[]arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        reverse(arr , 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(String[] arr , int stepL, int stepR){
        if (stepL >= stepR) return;
        String temp = arr[stepR];
        arr[stepR] = arr[stepL];
        arr[stepL] = temp;
        reverse(arr, stepL + 1, stepR - 1);
    }
}
