public class buyandsellstock {

    public static void approch3(int[] arr) {
        int min = arr[0];
        int finalprofit = 0;
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            finalprofit = arr[i] - min;
            profit = Math.max(finalprofit, profit);
            min = Math.min(min, arr[i]);
        }

        System.out.println("Max Profit " + profit);
    }

    public static void main(String[] args) {
        int[] arr = { 17, 44, 2, 41, 51, 67, 23 };
        approch3(arr);
    }
}
