import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        float a = scan.nextFloat();
        String sym = scan.next();
        float b = scan.nextFloat();
        switch (sym){
            case "+":
                System.out.print(a + b);
                break;
            case "-":
                System.out.print(a - b);
                break;
            case "*":
                System.out.print(a * b);
                break;
            case "/":
                System.out.print(a / b);
                break;
            case "%":
                System.out.print(a % b);
                break;
            default:
                System.out.print("Вы ввели не правильный символ!");
                break;
        }
    }
}