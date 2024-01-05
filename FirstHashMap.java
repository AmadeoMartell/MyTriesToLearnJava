import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FirstHashMap {
    public static void main(String[] args){
        Random random = new Random();
        long[] numlist = new long[10_000_000];
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] = random.nextInt(100);
        }
        HashMap<Long, Integer> numcount = new HashMap<>();
        for (long num: numlist) {
            if (!numcount.containsKey(num)) numcount.put(num, 0);
            numcount.put(num, numcount.get(num) + 1);
        }
        for (long key: numcount.keySet()) {
            System.out.println("Количество " + key + " в массиве: " + numcount.get(key));
        }
    }
}
