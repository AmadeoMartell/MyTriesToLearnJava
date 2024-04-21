package FirstThings;

import java.util.Scanner;
import java.util.Stack;

public class FirstStackUse <T> {
    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        Stack<String> myStack = new Stack<>();
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack.push("4");
        myStack.push("5");
        myStack.push("6");
        myStack.push("7");

        deleteMiddleEl(myStack, myStack.size());

        System.out.println(myStack);
    }

    public static <T> void deleteMiddleEl(Stack<T> stack, int size){
        if (stack.isEmpty()) return;
        int middle_ind = size / 2;
        deleteMiddle(stack, middle_ind);
    }

    public static <T> void deleteMiddle(Stack<T> stack, int ind){
        if (ind == 0){
            System.out.println("The middle element " + stack.pop() + " deleted!");
            return;
        }
        T temp = stack.pop();
        deleteMiddle(stack, ind - 1);
        stack.push(temp);
    }
}
