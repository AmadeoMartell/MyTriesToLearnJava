package ADSweek4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyArrayList <T> implements Iterable<T>, Collection<T>{
    private int size = 0;

    public int getCapacity() {
        return capacity;
    }

    private int capacity = 5;
    private Object[] array;

    public MyArrayList() {
        array = new Object[capacity];
    }
    public T get(int index){
        return (T) array[index];
    }
    public void set(int index, T el){
        array[index] = el;
    }

    public boolean add(T el){
        if(size == capacity){
            increaseBuffer();
        }
        array[size++] = el;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c == null) {
            throw new NullPointerException("The collection cannot be null");
        }
        for (Object elem : c) {
            if (!contains(elem)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c == null) {
            throw new NullPointerException("The collection cannot be null");
        }

        boolean modified = false;
        for (T element : c) {
            if (add(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (c == null) {
            throw new NullPointerException("The collection cannot be null");
        }
        for (Object elem : c) {
            if (contains(c)) remove(elem);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (c == null) {
            throw new NullPointerException("The collection cannot be null");
        }
        for (Object elem : c) {
            if(!contains(c)) remove(elem);
        }
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            removeInd(i);
        }
    }


    public void increaseSize(int newSize){
        if (size >= newSize) {
            System.out.println("Your new size smaller or equal to current size");
            return;
        }
        int tempSize = size;
        size = newSize;
        increaseBuffer(tempSize);
        size = tempSize;
    }
    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
    @Override
    public boolean remove(Object o){
        int ind = 0;
        while (ind != size){
            if((T) o == array[ind]){
                removeInd(ind);
                return true;
            }
            ind++;
        }
        return false;
    }
    public void removeInd(int ind){
        for(int i = ind; i < size - 1; i++){
            array[i] = array[i+1];
        }
        size--;
    }

    private void increaseBuffer(){
        capacity = (int) (size * 1.5);
        Object[] temp_array = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp_array[i] = array[i];
        }
        array = temp_array;
    }
    private void increaseBuffer(int oldSize){
        capacity = (int) (size * 1.5);
        Object[] temp_array = new Object[capacity];
        for (int i = 0; i < oldSize; i++) {
            temp_array[i] = array[i];
        }
        array = temp_array;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == null ? o == null : array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        return array.clone();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null; // I will do it later... When I will be a Senior
    }

    public T getLast() {
        return (T) array[size - 1];
    }

    private class MyIterator implements Iterator<T>{
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor != getSize();
        }

        @Override
        public T next() {
            T nextItem = get(cursor);
            cursor++;
            return nextItem;
        }
    }

}
