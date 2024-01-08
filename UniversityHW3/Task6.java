package UniversityHW3;

/*

Let's try to construct our first skyscraper and announce the result in the console. To do this, you need to call the constructor of the Skyscraper class in the main method and in the body of the constructor display the text “The skyscraper has been built.” in the console.

Requirements:
• The Skyscraper class must have a public constructor without parameters.
• In the main method you need to create one object of the Skyscraper class.
• The Skyscraper class constructor should display the text "The skyscraper has been built." to the console.

 */


public class Task6 {
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
    }
}
class Skyscraper{
    public Skyscraper(){
        System.out.println("The skyscraper has been built.");
    }
}
