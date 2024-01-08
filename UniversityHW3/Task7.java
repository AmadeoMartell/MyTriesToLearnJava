package UniversityHW3;

/*


Let's build a residential complex of three high-rise buildings. To do this, we will use three different ways to display information:

Announces the result of construction.
Announces the result and indicates the number of floors.
Announces the result and indicates the developer.

Example output:
The skyscraper has been built.
The skyscraper has been built. Number of floors - 50
The skyscraper has been built. Developer - JavaRushDevelopment

To solve the task, you need to declare three different constructors and display text in them.
The main method is not involved in testing.
Requirements:
• The Skyscraper class must have three public constructors.
• The Skyscraper class must have a parameterless constructor.
• The Skyscraper class must have a constructor with a parameter of type int.
• The Skyscraper class must have a constructor with a String parameter.
• In a parameterless constructor, the output must match the example in the condition.
• In a constructor with a parameter of type int, the output must match the example in the condition.
• In a constructor with a String parameter, the output must match the example in the condition.


 */
public class Task7 {
    public static void main(String[] args) {
        SkyscraperTask7 skyscraper = new SkyscraperTask7();
        SkyscraperTask7 skyscraperTower = new SkyscraperTask7(50);
        SkyscraperTask7 skyscraperSkyline = new SkyscraperTask7("JavaRushDevelopment");
    }
}
class SkyscraperTask7 {
    public int floors;
    public String Developer;
    public static final String SKYSCRAPER_WAS_BUILD = " The skyscraper has been built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = " The skyscraper has been built. Number of floors -";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = " The skyscraper has been built. Developer -";

    public SkyscraperTask7(int floors) {
        this.floors = floors;
        System.out.printf("%s %d %n", SKYSCRAPER_WAS_BUILD_FLOORS_COUNT, this.floors);
    }
    public SkyscraperTask7(String Developer) {
        this.Developer = Developer;
        System.out.printf("%s %s %n",SKYSCRAPER_WAS_BUILD_DEVELOPER, this.Developer);
    }

    public SkyscraperTask7() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
}
