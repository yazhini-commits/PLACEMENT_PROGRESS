package LEET_CODE.TWO_POINTER;

public class Two_sum_II_167 {

    static class Solution {

        public int[] twoSum(int[] numbers, int target) {

            int[] res = new int[2];

            int l = 0;
            int r = numbers.length - 1;

            while (l < r) {

                int sum = numbers[l] + numbers[r];

                if (sum == target) {
                    res[0] = l + 1;
                    res[1] = r + 1;
                    return res;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] numbers1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] ans1 = obj.twoSum(numbers1, target1);

        System.out.println("Example 1");
        System.out.println("Output: [" + ans1[0] + ", " + ans1[1] + "]");

        int[] numbers2 = { 2, 3, 4 };
        int target2 = 6;
        int[] ans2 = obj.twoSum(numbers2, target2);

        System.out.println("\nExample 2");
        System.out.println("Output: [" + ans2[0] + ", " + ans2[1] + "]");

        int[] numbers3 = { -1, 0 };
        int target3 = -1;
        int[] ans3 = obj.twoSum(numbers3, target3);

        System.out.println("\nExample 3");
        System.out.println("Output: [" + ans3[0] + ", " + ans3[1] + "]");
    }
}