package ADSweek1.Assigment3;

public class task4 {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
            System.out.print(i + " ");
        }
        System.out.println();
        // I create new method to MyArrayList removeInd() for removing items by index
        arrayList.removeInd(4); // 4 index == 5 element
//        public void removeInd(int ind){ // IMPLEMENTATION OF THIS METHOD
//            for(int i = ind; i < size - 1; i++){
//                array[i] = array[i+1]; // JUST MOVING ALL ELEMENTS FROM INDEX+1 TO LEFT(index not included)
//            }
//            size--; // DECREASE OUR SIZE OF INTERNAL ARRAY, 'CUZ WE DEL 1 ELEMENT
//        }
        for (Integer iter: arrayList){
            System.out.print(iter + " ");
        }
    }
}
