package DAY_3.RECURSION;

public class Climbing_stairs_70 {

    static class Solution {

        public int climbStairs(int n) {

            if (n == 0 || n == 1) {
                return 1;
            }

            int prev = 1;
            int curr = 1;

            for (int i = 2; i <= n; i++) {
                int temp = curr;
                curr = prev + curr;
                prev = temp;
            }

            return curr;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println("n = 2 -> " + obj.climbStairs(2));
        System.out.println("n = 3 -> " + obj.climbStairs(3));
        System.out.println("n = 4 -> " + obj.climbStairs(4));
        System.out.println("n = 5 -> " + obj.climbStairs(5));
        System.out.println("n = 10 -> " + obj.climbStairs(10));
        System.out.println("n = 45 -> " + obj.climbStairs(45));
    }
}