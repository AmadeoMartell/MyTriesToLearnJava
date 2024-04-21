package ADSweek1.recursive;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), n = scanner.nextInt();
        System.out.println(pow(a,n));
    }
    public static float pow(int a, int n){
        if (n == 1) return a;
        else if (n == 0) return 1;
        else if (n > 1) return a * pow(a, n - 1);
        else return 1 / (a * pow(a, n * (-1) - 1));
    }
}
