package ADSweek4;

import java.util.Iterator;
import java.util.LinkedList;

public class task011 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> reverseIterator = list.descendingIterator(); // using iterator to make reversed iter's list
        System.out.println("Reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
