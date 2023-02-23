public class Permutation {
    static int[] arr = { 1, 2, 3 };
    static boolean[] vis = new boolean[3];

    public static void helper(int idx) {

        for (int i = 0; i < 3; i++) {

        }
    }

    public static void main(String[] args) {

        helper(0);
    }
}

// Permutations (LinkedIn, Ebay, PayPal, PayTM)
// i/p : nums = [1,2,3]
// o/p : [[1,2,3],[1,3,2],[2,1,3],[3,2,1],[3,1,2],[2,3,1]]

// first = 0
// nums = [1,2,3]

// i = 0 = [1,2,3]
// first = 1
// i = 1 = [1,2,3]
// first = 2
// i = 2
// prem = [1,2,3]
// i = 2 = swap(nums[1], nums[2]) = [1,3,2]
// first = 2
// i = 2
// prem = [1,3,2]
// i = 1 = swap(nums[0], nums[1]) = [2,1,3]
// first = 1
// i = 1 = [2,1,3]
// first = 2
// i = 2
// prem = [2,1,3]
// i = 2 = swap(nums[1], nums[2]) = [2,3,1]
// first = 2
// i = 2
// prem = [2,3,1]
// i = 2 = swap(nums[0], nums[2]) = [3,2,1]
// first = 1
// i = 1 = [3,2,1]
// first = 2
// i = 2
// prem = [3,2,1]
// i = 2 = swap(nums[1], nums[2]) = [3,1,2]
// first = 2
// i = 2
// prem = [3,1,2]
