package ADSweek1.recursive;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(fibonacci(0, 1, scanner.nextInt()));
    }
    public static int fibonacci(int f0, int f1, int step){
        if(step == 0) return f0;
        int temp = f1;
        f1 += f0;
        f0 = temp;
        return fibonacci(f0, f1, --step);
    }
}
