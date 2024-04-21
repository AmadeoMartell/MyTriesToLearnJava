package ADSweek1.Assigment3;

public class task2 {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>(); // Using created own MyArrayList class
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        System.out.println("Current capacity: " + arrayList.getCapacity());
        System.out.println(arrayList);
        arrayList.increaseSize(7); // I add a new method to MyArrayList for
        // increasing current size of internal array in MyArrayList
//        public void increaseSize(int newSize){ // CREATING NEW METHOD TO INCREASE SIZE
//            if (size >= newSize) {
//                System.out.println("Your new size smaller or equal to current size");
//                return;
//            }
//            int tempSize = size; // NEED TO SAVE LAST SIZE, TO NOT BROKE WORKS OF MyArrayList
//            size = newSize;
//            increaseBuffer(tempSize);
//            size = tempSize;
//        }
//        private void increaseBuffer(int oldSize){ // METHOD OVERLOADING (of my increaseBuffer() method)
//            capacity = (int) (size * 1.5);
//            Object[] temp_array = new Object[capacity];
//            for (int i = 0; i < oldSize; i++) {
//                temp_array[i] = array[i];
//            }
//            array = temp_array;
//        }

        System.out.println("Current capacity after increasing size: " +arrayList.getCapacity());
        System.out.println(arrayList);
    }
}
