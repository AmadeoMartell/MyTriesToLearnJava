package ADSweek4;

import java.util.ArrayList;

public class task8 <T>{
    public static<T> void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        ArrayList<T> arrayList1 = (ArrayList<T>) arrayList.clone();

        System.out.println(arrayList1);
    }
}
