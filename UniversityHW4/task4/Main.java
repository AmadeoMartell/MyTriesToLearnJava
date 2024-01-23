package UniversityHW4.task4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Medeu");
        student.setAge(18);
        student.setStudentId(230465);

        Person person = new Person();
        person.setName("Medeu");
        person.setAge(18);

        Printable[] printables = {student, person};
        for (Printable printable : printables) {
            printable.printDetails();
            System.out.println();
        }

    }
}
