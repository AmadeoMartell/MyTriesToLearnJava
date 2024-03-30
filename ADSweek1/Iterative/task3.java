package ADSweek1.Iterative;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPrime(num));
    }
    public static String isPrime(int num){
        if (num <= 1) return "Not prime nor composite";
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) return "Composite";
        }
        return "Prime";
    }
}
