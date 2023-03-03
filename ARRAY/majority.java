import java.util.Arrays;
import java.util.HashMap;

class majority {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 };

        // Approch 1
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length / 2]);

        // Approch 2
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }

        for (int elem : arr) {
            if (hm.get(elem) >= arr.length / 2) {
                System.out.println("Majority element --> " + elem);
                break;
            }
        }

        // System.out.println();

    }
}