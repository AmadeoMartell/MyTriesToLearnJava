package day2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x = console.nextDouble();
        if(x >= 5) System.out.println((Math.pow(x, 2) - 10)/(x + 7));
        else if(x > -3 && x < 5) System.out.println((x+3)*(Math.pow(x, 2) - 2));
        else System.out.println(420);
    }
}
