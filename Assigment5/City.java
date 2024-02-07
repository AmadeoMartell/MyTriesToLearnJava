package Assigment5;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Building> buildings;

    public City(String name) {
        this.buildings = new ArrayList<>();
        this.name = name;
    }

    public void addBuilding(Building building){
        this.buildings.add(building);
    }

    public City() {
        this.buildings = new ArrayList<>();
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    public void removeBuilding(Building building) {
        this.buildings.remove(building);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Building findBuilding(String streetName, int houseNumber) {
        for (Building building : buildings) {
            if (building.getName().equals(streetName) && building.getNumber() == houseNumber) {
                return building;
            }
        }
        return null;
    }
}
