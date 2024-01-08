package UniversityHW3;
/*

School Subject Class:
Create a Subject class that stores information about a school subject (subject name, number of hours).
Implement methods for setting and getting information about the subject.


 */
public class task11 {
    public static void main(String[] args) {
        SchoolSubject sub1 = new SchoolSubject();
        sub1.setName("Literature");
        sub1.setHours(48);
        System.out.println("School subject name: " + sub1.getName() + ". Number of hours: " + sub1.getHours());
    }
}
class SchoolSubject{
    public String name;
    public int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
