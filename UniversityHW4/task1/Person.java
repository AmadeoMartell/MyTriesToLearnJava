package UniversityHW4.task1;

public class Person{
    private String name;
    private int age = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 150) this.age = age;
    }
}
