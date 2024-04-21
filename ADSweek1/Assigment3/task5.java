package ADSweek1.Assigment3;

import java.util.Iterator;

public class task5 {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        System.out.println("Size: " + arrayList.getSize()); // just checking size field from MyArrayList class(arrayList)
//        public int getSize() { // IMPLEMENTATION OF GETTER
//            return size;
//        }
        Iterator<Integer> iterator = arrayList.iterator(); // Using Iterator for iterate all elements from arrayList
//        @Override
//        public Iterator<T> iterator() { // IMPLEMENTATION OF ITERATOR TO MyArrayList CLASS
//            return new MyArrayList.MyIterator();
//        }
//
//        private class MyIterator implements Iterator<T>{
//            int cursor = 0; // CURRENT ELEMENT WHERE ITERATOR STOPS
//
//            @Override
//            public boolean hasNext() {
//                return cursor != getSize(); // CHECKING THAT CURSOR NOT GREATER THAN LAST ELEMENT INDEX
//            }
//
//            @Override
//            public T next() {
//                T nextItem = get(cursor);
//                cursor++;
//                return nextItem; // RETURNING CURRENT ITEM
//            }
//        }
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
