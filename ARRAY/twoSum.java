import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    public static int[] approch1(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];

            if (map.containsKey(val) == true) {
                // compute the answer
                int idx1 = i;
                int idx2 = map.get(val);
                int[] ans = { idx1, idx2 };
                return ans;
            } else {
                map.put(arr[i], i);
            }
        }
        int arr2[] = { -1, -1 };
        return arr2;

    }

    public static void approch2(int[] arr, int target) {

        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println("Pair found --> " + arr[i] + "-" + arr[j]);
                break;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j++;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ans = approch1(arr, 8);
        // if (ans[0] == -1) {
        // System.out.println("TargetNUmber NOt Found");
        // }
        // System.out.println("value1-->" + arr[ans[0]]);
        // System.out.println("value2-->" + arr[ans[1]]);
        approch2(arr, 14);
    }
}
