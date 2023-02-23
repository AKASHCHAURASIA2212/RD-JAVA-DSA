public class leader {

    public static void findLeader(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        System.out.print(max + "\t");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.print(arr[i] + "\t");
                max = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 44, 5, 6, 9, 8, 7, 6, 0, 6, 4 };
        findLeader(arr);
    }
}
