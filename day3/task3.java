package day3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iter = 0;
        while (iter++ < 5){
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            else System.out.println(a / b);
        }
    }
}
