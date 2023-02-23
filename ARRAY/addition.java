public class addition {

    static int[] add(int[] first, int[] second) {
        int[] ans = new int[Math.max(first.length, second.length) + 1];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = ans.length - 1;

        int carry = 0;
        while (k >= 0) {
            if (i >= 0 && j >= 0) {
                int sum = first[i] + second[j] + carry;
                System.out.println(sum);
                if (sum >= 10) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                sum = sum % 10;
                ans[k] = sum;
            } else if (i >= 0 && j < 0) {
                int sum = first[i] + carry;
                System.out.println(sum);
                if (sum >= 10) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                sum = sum % 10;
                ans[k] = sum;
            } else if (i < 0 && j >= 0) {
                int sum = second[j] + carry;
                System.out.println(sum);
                if (sum >= 10) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                sum = sum % 10;
                ans[k] = sum;
            }
            i--;
            j--;
            k--;
        }

        return ans;

    }

    static int[] subtract(int[] first, int[] second) {
        int[] ans = new int[Math.max(first.length, second.length) + 1];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = ans.length - 1;

        int borrow = 0;
        while (k >= 0) {
            if (i >= 0 && j >= 0) {
                int fnum = first[i] + borrow;
                if (second[j] > fnum) {
                    fnum += 10;
                    borrow = -1;
                } else {
                    borrow = 0;
                }
                int res = fnum - second[j];
                ans[k] = res;
                System.out.println(res);

            } else if (i >= 0 && j < 0) {
                int fnum = first[i] + borrow;

                int res = fnum;
                ans[k] = res;
                System.out.println(res);

            } else if (i < 0 && j >= 0) {
                int fnum = second[i] + borrow;

                int res = fnum;
                ans[k] = res;
                System.out.println(res);

            }
            i--;
            j--;
            k--;

            ans[0] = borrow;
        }

        return ans;

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] n1 = { 5, 1, 0, 0 };
        int[] n2 = { 4, 5, 0, 0 };

        // int ans[] = add(n1, n2);
        int ans[] = subtract(n1, n2);
        display(ans);
    }
}
