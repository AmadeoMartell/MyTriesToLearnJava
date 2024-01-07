import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("#.######");
        ArrayList<String> calclog = new ArrayList<>();
        try (Scanner scan = new Scanner(new FileReader("input.txt"))){
            while (scan.hasNextLine()){
                try {
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
                            calclog.add("Вы ввели не правильно задачу!");
                        }
                    }
                }
                catch (InputMismatchException er){
                    calclog.add("Вы ввели не правильно задачу!");
                }
                if (scan.nextLine() == null) break;

            }
        }
        catch (IOException error){
            System.out.println(error.getMessage());
        }
        OutputWriter.write(calclog);
    }
}
