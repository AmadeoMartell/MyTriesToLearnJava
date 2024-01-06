package UniversityHW3;

/*
The program should display the population of the largest cities in the world and compare them with the largest city - Tokyo. But the program algorithm is a little broken. To fix the error, you need to make sure that in the line displaying information about the largest city in the world, static class variables are used instead of local method arguments.

If the program is running correctly, the output should be as follows:
The population of the city of Jakarta is 25.3 million people.
While the most populous city of Tokyo has a population of 34.5 million people.
The population of the city of Seoul is 25.2 million people.
While the most populous city of Tokyo has a population of 34.5 million people.
The population of the city of Delhi is 23.1 million people.
While the most populous city of Tokyo has a population of 34.5 million people.
The population of New York City is 21.6 million people.
While the most populous city of Tokyo has a population of 34.5 million people.

Requirements:
• Variable names cannot be changed.
• To display information about the largest city, static variables of the city and population classes must be used.
• The output of the program in the console must correspond to the conditions of the task.

 */
public class Task5 {
    public static String city = "Токио";
    public static double population = 34.5;
    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("The population of the city of " + city + " is " + population + " million people.");
        System.out.println("While the most populous city of " + Task5.city + " has a population of " + Task5.population + " million people.");
    }

}
