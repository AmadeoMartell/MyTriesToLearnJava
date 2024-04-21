package ADSweek1.Assigment3;

public class task3 <T>{
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>(); // Using created own MyArrayList class
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
            System.out.print(i + " ");
        }
        System.out.println();
        reverse(arrayList);
        for (Integer iter: arrayList) System.out.print(iter + " ");
    }
    public static <T> void reverse(MyArrayList<T> arr){
        MyArrayList<T> tempArr = new MyArrayList<>();
        for (int i = arr.getSize() - 1; i >= 0; i--){ // Adding all element to tempArr by Descending order
            tempArr.add(arr.get(i));
        }
        for (int i = 0; i < arr.getSize(); i++) {  // Saving all elements from tempArr to our origin array
            arr.set(i, tempArr.get(i));
        }
    }
}
