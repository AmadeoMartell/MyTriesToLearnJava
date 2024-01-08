package UniversityHW3;

/*

The construction of the building was planned as a restaurant and was successfully completed, but after some time the owners decided to convert it into a barbershop. We need to make sure that the building is universal, and its purpose can be changed without creating a new one.
To do this, create an initialize method that will set the value of the type field (to determine the type of building), and remove the constructor.

Requirements:
• The Building class must have a private field type of type String.
• There should be no declared constructors in the Building class.
• The Building class must have a non-static public void initialize method with a parameter of type String.
• Initialization of the type field must be in the initialize(String) method.

 */
public class task10 {
    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}
class Building {
    private String type = "Ресторан";

    public void initialize(String type) {
        this.type = type;
    }

}
