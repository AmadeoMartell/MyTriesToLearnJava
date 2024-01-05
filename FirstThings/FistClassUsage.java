package FirstThings;

import java.util.Scanner;

public class FistClassUsage {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int members = console.nextInt();
        FirstClass[] Group = new FirstClass[members];
        for (int i = 0; i < members; i++) {
            Group[i] = new FirstClass();
            System.out.println("Введите данные ученика в формате Barcode, Name, Age, GPA: ");
            Group[i].setId(console.nextInt());
            Group[i].setName(console.next());
            Group[i].setAge(console.nextInt());
            Group[i].setGPA(console.nextFloat());
            System.out.println();
        }
        int MaxGpaID = 0;
        float GPA = 0, MaxGPA = Group[0].getGPA();
        for (int i = 0; i < members; i++) {
            if (Group[i].getGPA() > MaxGPA) {
                MaxGPA = Group[i].getGPA();
                MaxGpaID = i;
            }
            GPA += Group[i].getGPA();
        }
        System.out.println("Average GPA of Group: " + (GPA/members));
        System.out.println("The best Student: " + Group[MaxGpaID].getName() + ". He/She got " +
                Group[MaxGpaID].getGPA() + " Academic GPA");
        // Some Garbage is Here for test
    }
}
class FirstClass {
    private int id;
    private int age;
    private String Name;
    private float GPA;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
}
