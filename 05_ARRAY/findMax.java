
public class findMax {

    public static int max(int[] arr) {
        int max = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x > max)
                max = x;
        }
        return max;
    }

    // public static void main(String[] args) {
    // int[] arr = { 18, 02, 23, 94, 55, 66, 17, 38 };
    // int max = 0;
    // for (int x : arr) {
    // if (x > max)
    // max = x;
    // }
    // System.out.println("MAX -> " + max);
    // }
}
