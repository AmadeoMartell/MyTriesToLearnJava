package ADSweek4;

import java.util.Collections;

public class task6 {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        System.out.println(Collections.max(arrayList));
        // just do public class MyArrayList <T> implements Iterable<T>, Collection<T>
//        public boolean add(T el){  /// ALL METHOD THAT I IMPLEMENTED TO MAKE CLASS COLLECTION
//            if(size == capacity){
//                increaseBuffer();
//            }
//            array[size++] = el;
//            return true;
//        }
//
//        @Override
//        public boolean containsAll(Collection<?> c) {
//            if (c == null) {
//                throw new NullPointerException("The collection cannot be null");
//            }
//            for (Object elem : c) {
//                if (!contains(elem)) {
//                    return false;
//                }
//            }
//            return true;
//        }
//
//        @Override
//        public boolean addAll(Collection<? extends T> c) {
//            if (c == null) {
//                throw new NullPointerException("The collection cannot be null");
//            }
//
//            boolean modified = false;
//            for (T element : c) {
//                if (add(element)) {
//                    modified = true;
//                }
//            }
//            return modified;
//        }
//
//        @Override
//        public boolean removeAll(Collection<?> c) {
//            if (c == null) {
//                throw new NullPointerException("The collection cannot be null");
//            }
//            for (Object elem : c) {
//                if (contains(c)) remove(elem);
//            }
//            return true;
//        }
//
//        @Override
//        public boolean retainAll(Collection<?> c) {
//            if (c == null) {
//                throw new NullPointerException("The collection cannot be null");
//            }
//            for (Object elem : c) {
//                if(!contains(c)) remove(elem);
//            }
//            return true;
//        }
//
//        @Override
//        public void clear() {
//            for (int i = 0; i < size; i++) {
//                removeInd(i);
//            }
//        }
//        @Override
//        public boolean isEmpty() {
//            return (size() == 0);
//        }
//
//        @Override
//        public boolean contains(Object o) {
//            for (int i = 0; i < size; i++) {
//                if (array[i] == null ? o == null : array[i].equals(o)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//        @Override
//        public Object[] toArray() {
//            return array.clone();
//        }
    }
}
