package FirstThings;

public class FirstStreamUsage {
    public static void main(String[] args) {

    }
}


/* Коды которые мне надо будет понять

1)
public static String orderStr(String string) {

    return Arrays.stream(string.split(" "))
            .sorted((a, b) -> Integer.compare(Integer.parseInt(a.replaceAll("\\D", "")), Integer.parseInt(b.replaceAll("\\D", ""))))
            .collect(Collectors.joining(" "));
  }

2)
public static String orderStr(String string) {
    return Arrays.stream(string.split(" "))
            .sorted(Comparator.comparingInt(a ->
                    Integer.parseInt(a.replaceAll("\\D", ""))))
            .collect(Collectors.joining(" "));
  }

3)
public static String orderWords(String input) {
        return Arrays.stream(input.split("\\s+"))
                .sorted(Comparator.comparingInt(Application::getNumberFromWord))
                .collect(Collectors.joining(" "));
    }

    static int getNumberFromWord(String word) {
        return word.chars()
                .filter(Character::isDigit)
                .findFirst()
                .getAsInt();
    }

 */
