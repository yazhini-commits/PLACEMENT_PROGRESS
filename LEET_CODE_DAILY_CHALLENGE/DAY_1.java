public class DAY_1 {

    public static void main(String[] args) {

        int[] nums = { 1, 1,1,1 };
        int target = 1;

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = i; j < nums.length; j++) {

                if (nums[j] == target) {
                    count++;
                }

                int length = j - i + 1;

                if (count > length / 2) {
                    ans++;
                }
            }
        }

        System.out.println("Answer = " + ans);
    }
}