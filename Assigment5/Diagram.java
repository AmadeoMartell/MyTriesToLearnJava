package Assigment5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Diagram {
    public static void main(String[] args) {
        System.out.println("Task A:");
        City city = new City();
        city.setName("Astana");
        Building[] buildings = new Building[2];
        buildings[0] = new Building("Kaldayakova 1", 11, 360.50f);
        buildings[1] = new Building("Al-Farabi 12", 21, 200.10f);
        Room[] room = new Room[3];
        room[0] = new Room(101, 14.5);
        room[1] = new Room(666, 12.3);
        room[2] = new Room(101, 13.8);

        System.out.printf("My city: %s%n", city.getName());
        System.out.print("My buildings:\n");
        Arrays.stream(buildings).forEach(x -> System.out.printf("House Number: %d \t Street: %s \t MontlyPayment: %f%n", x.getHouseNumber(), x.getStreetName(), x.getMonthlyPayment()));
        System.out.print("My rooms:\n");
        Arrays.stream(room).forEach(x -> System.out.printf("Number of rooms: %d \t Area: %f%n", x.getNumber(), x.getArea()));

        System.out.println("\nTask B:");
        buildings[0].addRoom(room[0]);
        buildings[1].addRoom(room[1]);
        buildings[1].addRoom(room[2]);


        for(Building building: buildings){
            System.out.println("-----------------------------------------");
            System.out.println("House number: " + building.getHouseNumber());
            System.out.println("Address: " + building.getStreetName());
            System.out.println("Monthly Payment: " + building.getStreetName());
            System.out.println("Room count: " + building.getRooms().size());
            for(Room rooms: building.getRooms()){
                System.out.println("Room number " + rooms.getNumber() + ". Area: " + rooms.getArea());
            }
            System.out.println("-----------------------------------------");
            System.out.println("Total area of all rooms: " + building.getTotalArea());
        }
        System.out.println("\nTask C:");
        city.addBuilding(buildings[0]);
        city.addBuilding(buildings[1]);
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Input street name: ");
            String street = reader.readLine();
            System.out.print("Input house number: ");
            int h_number = Integer.parseInt(reader.readLine());
            System.out.println(city.findBuilding(street, h_number));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
