import java.util.Scanner;

public class FistClassUsage {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int members = console.nextInt();
        FirstClass[] Group = new FirstClass[members];
        for (int i = 0; i < members; i++) {
            Group[i] = new FirstClass();
            System.out.println("Введите данные ученика в формате Barcode, Name, Age, GPA: ");
            Group[i].id = console.nextInt();
            Group[i].Name = console.next();
            Group[i].age = console.nextInt();
            Group[i].GPA = console.nextFloat();
            System.out.println();
        }
        float GPA = 0;
        for (int i = 0; i < members; i++) {
            GPA += Group[i].GPA;
        }
        System.out.println("Average GPA of Group: " + (GPA/members));
    }
}
class FirstClass {
    public int id, age;
    public String Name;
    public float GPA;
}
