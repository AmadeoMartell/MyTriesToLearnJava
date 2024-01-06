package UniversityHW3;
/*

The main method prints too many lines of information about various concepts.
It would be logical to separate the output of information about hydrogen and about the island of Java into different methods.
Create a public static void printHydrogenInfo() method that should print all lines about hydrogen.
Also create a public static void printJavaInfo() method that will print all the strings about the island of Java.
Finally, in the main() method, call these two methods.
The overall console output should not change.

 */
public class Task1 {
    public static void main(String[] args) {
        printHydrogenInfo();
        System.out.println();
        printJavaInfo();
        }
        public static void printHydrogenInfo(){
            System.out.println("Hydrogen:");
            System.out.println("This is a chemical element of the periodic table with symbol H and atomic number 1.");
            System.out.println("Is the lightest element of the table.");
            System.out.println("Hydrogen is used in:");
            System.out.println("-Chemical industry;");
            System.out.println("-Oil refining industry;");
            System.out.println("-Aviation;");
            System.out.println("-Electricity.");
        }
        public static void printJavaInfo(){
            System.out.println("Java Island:");
            System.out.println("Part of Indonesia.");
            System.out.println("The states of Mataram, Majapahit, Demak were born on the island.");
            System.out.println("Java is the most populated island in the world:");
            System.out.println("Total population - 140 million people.");
            System.out.println("Population density - 1061 people/sq. km.");
            System.out.println("One of the famous varieties of coffee, Kopi Luwak, is produced here.");
        }
    }

