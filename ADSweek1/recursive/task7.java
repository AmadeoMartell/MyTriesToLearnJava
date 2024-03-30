package ADSweek1.recursive;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isDigitConsist(str, str.length()-1) ? "Yes" : "No");
    }
    public static boolean isDigitConsist(String str , int len){
        if (len == -1) return true;
        if (str.charAt(len) <= '9' && str.charAt(len) >= '0') return isDigitConsist(str, len - 1);
        else return false;
    }
}
