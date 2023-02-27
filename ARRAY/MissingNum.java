public class MissingNum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int sum = ((n) * (n + 1) / 2);
        int rsum = 0;
        for (int x : arr) {
            rsum += x;
        }
        System.out.println("Runnimg Num is " + (rsum));
        System.out.println("Sum of Num is " + (sum));
        System.out.println("Missing Num is " + (sum - rsum));
    }
}
