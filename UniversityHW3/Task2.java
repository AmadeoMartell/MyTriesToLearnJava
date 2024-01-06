package UniversityHW3;

/*
Rename the parameters of the printPersonInfo() method:

firstName in name;
lastName in surname;
favoriteDish in meal;
so that the functionality of the program remains unchanged.
Leave the variable names in the main() method unchanged.
Print to the console using the method.
 */
public class Task2 {
    public static void main(String[] args) {
        String firstName = "Sultan";
        String lastName = "Suleyman";
        String favouriteDish = "Steak";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.print(name + " "+ surname + ", favourite dish: " + meal);
    }

}
