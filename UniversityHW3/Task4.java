package UniversityHW3;


/*
It would be nice to have one method for solving different problems. You have the opportunity to write one.
Create 9 more universalMethod() methods. In total there should be 10 of them.
Come up with the parameters they should accept yourself.
Requirements:
• The program must contain 10 methods named universalMethod.
 */
public class Task4 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod(1);
        universalMethod(1, 2);
        universalMethod(1, 2, 3);
        universalMethod("String");
        universalMethod(new int[]{1, 2, 3, 4});
        universalMethod("String1", "String2");
        universalMethod(3.14d);
        universalMethod(3.14f, 1);
        universalMethod(3.14f, true);
    }
    static void universalMethod() {
    }

    static void universalMethod(int a) {
    }

    static void universalMethod(int a, int b) {
    }

    static void universalMethod(int a, int b, int c) {
    }

    static void universalMethod(String s) {
    }

    static void universalMethod(int[] array) {
    }

    static void universalMethod(String s1, String s2) {
    }

    static void universalMethod(double d) {
    }

    static void universalMethod(float f, int a) {
    }
    static void universalMethod(float f, boolean a) {
    }
}