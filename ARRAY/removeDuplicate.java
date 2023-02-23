class removeDuplicate {
    static int helper(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 2, 3, 5, 5, 6, 6, 6, 7 };
        int ans = helper(arr);
        System.out.println(ans);
    }
}