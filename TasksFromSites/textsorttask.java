package TasksFromSites;

import java.util.Scanner;

public class textsorttask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        System.out.println(sort(line));
    }
    public static String sort(String[] line){
        int a = line.length;
        for (int i = 0; i < a; i++) {
            if (!line[i].contains(i + 1 + "")){
                String temp = line[i];
                for (int j = i + 1; j < a; j++) {
                    if (line[j].contains(i + 1 + "")){
                        line[i] = line[j];
                        line[j] = temp;
                        break;
                    }

                }
            }
        }
        String newline = String.join(" ", line);
        return newline;
    }
}
