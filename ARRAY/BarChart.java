
public class BarChart {

    // public static int findMax(int[] arr) {
    // int max = 0;
    // for (int x : arr) {
    // if (x > max)
    // max = x;
    // }
    // return max;
    // }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 0, 7 };
        findMax fm = new findMax();
        int rowSize = fm.max(arr);
        int colSize = arr.length;

        for (int i = rowSize - 1; i >= 0; i--) {
            for (int j = 0; j < colSize; j++) {
                if (arr[j] - 1 >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
}
