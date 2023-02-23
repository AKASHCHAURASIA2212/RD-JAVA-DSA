public class IsSorted {
    public static boolean isSort(int[] arr) {
        boolean temp1 = true;
        ;
        boolean temp2 = true;
        ;

        // this will check arr is sorted in incresing order
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    temp1 = false;
                }
            } else {
                if (arr[i] < arr[i - 1] || arr[i] > arr[i + 1]) {
                    temp1 = false;
                }
            }

            if (temp1 == false) {
                break;
            }
        }

        // this will check arr is sorted in deccresing order
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                if (arr[i] < arr[i + 1]) {
                    temp2 = false;
                }
            } else {
                if (arr[i] > arr[i - 1] || arr[i] < arr[i + 1]) {
                    temp2 = false;
                }
            }

            if (temp2 == false) {
                break;
            }
        }
        return temp1 || temp2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8 };
        System.out.println(isSort(arr));
    }
}
