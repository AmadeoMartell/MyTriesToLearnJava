import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("#.######");
        Scanner scan = new Scanner(System.in);
        boolean statement = true;
        ArrayList<String> calclog = new ArrayList<>();
        while (statement){
            System.out.print("Введите уравнение (Example 2 + 2): ");
            float a = scan.nextFloat();
            String sym = scan.next();
            float b = scan.nextFloat();
            switch (sym){
                case "+" -> calclog.add("Ответ: " + dF.format(a + b));
                case "-" -> calclog.add("Ответ: " + dF.format(a - b));
                case "*" -> calclog.add("Ответ: " + dF.format(a * b));
                case "/" -> calclog.add("Ответ: " + dF.format(a / b));
                case "%" -> calclog.add("Ответ: " + dF.format(a % b));
                default -> {
                    calclog.add("Вы ввели не правильный символ!");
                    statement = false;
                }
            }
        }
        OutputWriter.write(calclog);
//        for (String iter: calclog){
//            System.out.println(iter);
//        }
    }
}