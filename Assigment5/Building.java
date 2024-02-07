package Assigment5;

import java.util.ArrayList;

public class Building extends City{
    private String streetName;
    private int houseNumber;
    private float monthlyPayment;
    private ArrayList<Room> rooms;

    public Building() {
        this.rooms = new ArrayList<>();
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Building(String streetName, int houseNumber, float monthlyPayment) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.monthlyPayment = monthlyPayment;
        this.rooms = new ArrayList<>();
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public double getTotalArea(){
        double area = 0;
        for(Room room: rooms){
            area += room.getArea();
        }
        return area;
    }
    public String getName() {
        return streetName;
    }

    public void setName(String name) {
        this.streetName = name;
    }

    public int getNumber() {
        return houseNumber;
    }

    public void setNumber(int number) {
        this.houseNumber = number;
    }

    public float getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(float monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public String toString() {
        return "Building{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", monthlyPayment=" + monthlyPayment +
                ", rooms=" + rooms +
                '}';
    }
}
