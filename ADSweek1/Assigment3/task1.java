package ADSweek1.Assigment3;

import java.util.*;

public class task1 <T>{
    public static void main(String[] args) {
        MyArrayList<String> arrayList1 = new MyArrayList<>(); // Using created MyArrayList class
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        arrayList1.add("4");
        arrayList1.add("5");
        MyArrayList<String> arrayList2 = new MyArrayList<>();
        arrayList2.add("6");
        arrayList2.add("7");
        arrayList1.addAll(arrayList2);

        myShuffle(arrayList1);
        printMyArray(arrayList1);
    }
    public static <T> void myShuffle(MyArrayList<T> arr){
        int size = arr.getSize();
        MyArrayList<T> result = new MyArrayList<>();
        while(size != 0) {
            result.add(arr.get((int)(Math.random()*size--)));
            arr.remove(result.getLast());
        }

        for(int i = 0; i < result.getSize(); i++)
            arr.add(result.get(i));
    }

    public static <T> void printMyArray(MyArrayList<T> arr){
        for (T iter: arr) System.out.print(iter);
        System.out.println();
    }
}

