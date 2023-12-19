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
        int MaxGpaID = 0;
        float GPA = 0, MaxGPA = Group[0].GPA;
        for (int i = 0; i < members; i++) {
            if (Group[i].GPA > MaxGPA) {
                MaxGPA = Group[i].GPA;
                MaxGpaID = i;
            }
            GPA += Group[i].GPA;
        }
        System.out.println("Average GPA of Group: " + (GPA/members));
        System.out.println("The best Student: " + Group[MaxGpaID].Name + ". He/She got " +
                Group[MaxGpaID].GPA + " Academic GPA");
    }
}
class FirstClass {
    public int id, age;
    public String Name;
    public float GPA;
}
