import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class OutputWriter {
    public static void write(ArrayList<String> array){
        try {
            File file = new File("output.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileWriter writer = new FileWriter("output.txt", false)) {
                for (String value : array) {
                    writer.write(value + "\n");
                }
            }
        }
        catch (IOException error){
            System.out.println(error);
        }
    }
}
