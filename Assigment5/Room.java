package Assigment5;

public class Room extends Building{
    private int number;
    private double area;
    private Building building;

    public Room() {
    }

    public Room(int number, double area) {
        this.number = number;
        this.area = area;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", area=" + area +
                '}';
    }
}
