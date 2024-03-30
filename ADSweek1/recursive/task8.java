package ADSweek1.recursive;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); int b = scanner.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b){
        if (b > a) return gcd(b , a);
        if (a % b == 0) return b;
        else return gcd(b, a % b);
    }
}
