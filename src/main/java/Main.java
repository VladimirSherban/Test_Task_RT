import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 1, 5, 4};

        System.out.println(effectiveFilterArr(arr));
        System.out.println(filterArr(arr));
    }

    //Второй метод, эффективный, имеет линейную сложность O(n)
    public static Map<Integer, Integer> effectiveFilterArr(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : arr) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        return map;
    }

    //Первый метод который я написал, имеет квадратичную сложность O(n^2), не эффективно.
    public static Map<Integer, Integer> filterArr(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int counter;
        for (int k : arr) {
            counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (k == arr[j]) {
                    counter++;
                }
                if (j == arr.length - 1) {
                    map.put(k, counter);
                }
            }
        }
        return map;
    }
}
