package UniversityHW3;
/*
Working with Students: Write a Student class that contains information about a student (name, age, GPA).
Implement methods to display student information and update their GPA.
 */
public class task12 {
    public static void main(String[] args) {
        Student student = new Student("Name", 18);
        student.setGPA(3.15f);
        System.out.println(student.getGPA());
    }
}
class Student{
    private String name;
    private int age;
    private float GPA;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public float getGPA() {
        return GPA;
    }
}