package UniversityHW3;
/*

Let's build a business center that consists of two buildings, one of which is just starting to be built, and the second is at the planning stage, so little is known about it.
You will need to create two constructors: one with parameters, the second without. They should both initialize the floorsCount and developer fields.

Requirements:
• The Skyscraper class must have two public constructors.
• The Skyscraper class must have a parameterless constructor.
• The Skyscraper class must have a constructor with parameters of type int and type String.
• The Skyscraper class must have a private non-static field of type int called floorsCount.
• The Skyscraper class must have a private, non-static String field called developer.
• In a parameterless constructor, the fields must be initialized to "5" and "JavaRushDevelopment".
• In a constructor with parameters, the fields must be initialized with the arguments of that constructor.

 */
public class task8 {
    public static void main(String[] args) {
        SkyscraperTask8 skyscraper = new SkyscraperTask8();
        SkyscraperTask8 skyscraperUnknown = new SkyscraperTask8(50, " Unknown ");
    }
}
class SkyscraperTask8 {
    private int floorsCount;
    private String developer;

    public SkyscraperTask8() {
        floorsCount = 5;
        developer = "JavaRushDevelopment";
    }

    public SkyscraperTask8(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }
}
