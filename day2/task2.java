package day2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt(), b = console.nextInt();
        if(a >= b) System.out.println("Некорректный ввод");
        for(;a <= b ; a++){
            if(a % 5 == 0 && a % 10 != 0) System.out.print(a + " ");
        }
    }
}
