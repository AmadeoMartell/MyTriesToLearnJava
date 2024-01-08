package UniversityHW3;

/*

Feel like a car designer and find a solution to make the plant work again. To do this, you need to add initialization of fields in constructors with the appropriate parameters. If the parameter is missing, then you need to initialize the field with the default value. For the year field this is the current year (4321), for the color field it is Orange.

Requirements:
• The CarConcern class must have four private final fields.
• The CarConcern class must have a public constructor with three parameters that initializes the appropriate fields.
• The CarConcern class must have a public constructor with two parameters that initializes the appropriate fields.
• The CarConcern class must have a public constructor with one parameter that initializes the appropriate fields.

 */
public class task9 {
    public static void main(String[] args) {
        CarConcern car1 = new CarConcern("model1");
        CarConcern car2 = new CarConcern("model1", 1991);
        CarConcern car3 = new CarConcern("model1", 1991, "Black");
    }
}

class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Orange";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Orange";
    }
}

