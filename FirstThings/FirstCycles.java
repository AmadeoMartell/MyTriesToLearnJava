package FirstThings;

import java.util.Scanner;

public class FirstCycles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = 3; // Integer.parseInt("12335");
        System.out.println(a + 1);
        while (a <= 10) System.out.println("Сейчас тут цифра: " + a++);
        for (int i = 1; i <= 10; i++) System.out.println("Сейчас тут цифра: " + i);
        do {
            System.out.println("Сейчас тут цифра: " + a++);
        } while (a <= 10);
    }
}
