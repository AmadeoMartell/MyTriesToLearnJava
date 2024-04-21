package ADSweek1.Assigment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        Collections.swap(arrayList, 4 , 5); // swap 4 and 5 elements

        System.out.println(arrayList);
    }
}
