import java.util.HashMap;
import java.util.Set;
/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55

It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.

 */
public class UniqueNum {
    public static void main(String[] args){
        System.out.println(Kata.findUniq(new double[]{1, 1 , 0 , 1, 1}));
    }
}
class Kata {
    public static double findUniq(double[] arr) {
        HashMap<Double, Integer> nums = new HashMap<>();
        for (double iter : arr) {
            if (!nums.containsKey(iter)) {
                nums.put(iter, 0);
            } else if (nums.get(iter) == 2) {
                continue;
            } else nums.put(iter, nums.get(iter) + 1);
        }
        for (double key : nums.keySet()) {
            if (nums.get(key) == 0) {
                return key;
            }
        }
        return arr[0];
    }
}