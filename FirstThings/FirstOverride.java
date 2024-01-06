package FirstThings;

public class FirstOverride {
    public static void main(String[] args){
        Vehicle car = new Vehicle(12.4f,"Vladislav", "Red");
        Car veh1 = new Car(12.4f,"Vladislav", "Red");
        helicopter veh2 = new helicopter(12.4f,"Vladislav", "Red");;

        car.info();
        veh1.info();
        veh2.info();
    }
}
class Vehicle{
    private float speed;
    private String Person, color;
    public Vehicle(float speed, String Person, String color) {
        this.speed = speed;
        this.Person = Person;
        this.color = color;
    }
    public void info(){
        System.out.println(toString());
        System.out.println("Транспорт все еще неизвестен!");
    }
    @Override
    public String toString(){
        return "Водитель " + Person + " на неизвестном т/c " + color + " цвета едет со скоростью " + speed + " км/ч.";
    }
}
class Car extends Vehicle{
    public Car(float speed, String Person, String color) {
        super(speed, Person, color);
    }

    @Override
    public void info() {
        System.out.println(toString());
        System.out.println("Он водитель машины!");
    }
}

class helicopter extends Vehicle{
    public helicopter(float speed, String Person, String color) {
        super(speed, Person, color);
    }

    @Override
    public void info() {
        System.out.println(toString());
        System.out.println("Он водитель вертолета!");
    }
}
