package UniversityHW4.task3;

public class Student extends Person{
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void printDetails() {
        System.out.printf("Student name: %s, age: %d, Barcode: %d", getName(), getAge(), getStudentId());
    }

}
