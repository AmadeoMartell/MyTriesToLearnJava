package ADSweek4;

import java.util.LinkedList;

public class task010 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 5);

        System.out.println(list);
    }
}
