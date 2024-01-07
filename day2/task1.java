package day2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int home = console.nextInt();
        if (home >= 1 && home <= 4) System.out.println("Малоэтажный дом");
        else if(home >= 5 && home <= 8) System.out.println("Среднеэтажный дом");
        else if(home >= 9) System.out.println("Многоэтажный дом");
        else System.out.println("Ошибка ввода");
    }
}
