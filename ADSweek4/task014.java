package ADSweek4;

import java.util.LinkedList;
import java.util.Queue;

public class task014 {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public task014() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int x) {
        queue1.add(x);
    }
    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Pop operation attempted on an empty stack");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int top = queue1.remove();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }

    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Top operation attempted on an empty stack");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        int top = queue1.peek();
        queue2.add(queue1.remove());

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        task014 stack = new task014();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        stack.push(4);
        System.out.println("Top element: " + stack.top());
        System.out.println("Is stack empty? " + stack.empty());
    }
}

