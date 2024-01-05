package FirstThings;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstFunctions {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int StudentCount = console.nextInt();
        ArrayList<Integer> Grades = new ArrayList<>(StudentCount);
//        int[] Grades = new int[StudentCount];
        for (int i = 0; i < StudentCount; i++) {
            Grades.add(console.nextInt());
        }
        System.out.println(AvgGrade(Grades));
        console.close();
    }
    public static float AvgGrade(ArrayList<Integer> a){
        int sum = 0;
        for (Integer el: a) sum += el;
        return (float) sum / a.size();
    }
}


