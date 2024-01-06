package UniversityHW3;
/*
Let's write a utility for working with arrays. The main part of the functionality, the printArray() method displays all array elements in the console.
Another method is reverseArray(). It should reverse the order of the array elements.
The method should only work with arrays of integer values (int[]).

Example:
If the array contained elements:
1, 2, 3, 4, 5, 6, 7, 8, 9, 0
then after calling the reverseArray() method it should contain:
0, 9, 8, 7, 6, 5, 4, 3, 2, 1

Requirements:
• The reverseArray() method must reverse the order of the array elements.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int a = input.nextInt();
        int[] arr = new int[a];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < a; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Ваш перевернутый массив:");
        reverseArray(arr);
        for (int iter: arr) {
            System.out.print(iter + " ");
        }
    }
    public static void reverseArray(int[] array){
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
