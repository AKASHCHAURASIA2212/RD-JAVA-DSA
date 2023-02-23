public class rotateArr {

    public static void reverse(int arr[], int i, int j) {
        int n = arr.length;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int arr[], int k) {
        int len = arr.length;
        k = (k % len);

        if (k < 0) {
            k = k + len;
        }

        reverse(arr, 0, k - 1);
        reverse(arr, k, len - 1);
        reverse(arr, 0, len - 1);
        display(arr);
    }

    public static void rotateSpace(int arr[], int k) {
        int n = arr.length;
        int[] temp = new int[n];
        System.out.println("Before rotating---------");
        display(arr);
        for (int i = 0; i < n; i++) {
            temp[(k + i) % n] = arr[i];
        }
        arr = temp;
        System.out.println("After rotating---------");
        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        // rotate(arr, k);
        rotateSpace(arr, k);
    }
}
