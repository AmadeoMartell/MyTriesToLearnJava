package ADSweek1.recursive;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPrime(num, 2));
    }
    public static String isPrime(int num, int step){
        if (num <= 1) return "Not prime nor composite";
        if (step > Math.sqrt(num)) return "Prime";
        else if (num % step == 0) return "Composite";
        return isPrime(num, ++step);
    }
}
