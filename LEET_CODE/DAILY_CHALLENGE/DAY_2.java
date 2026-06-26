import java.util.Scanner;

public class DAY_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        long cnt = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target)
                nums[i] = 1;
            else
                nums[i] = -1;
        }

        int[] pref = new int[n];
        pref[0] = nums[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }

        int shift = n;
        int[] freq = new int[2 * n + 1];

        freq[shift] = 1;

        long valid = 0;
        int lastSum = 0;

        for (int i = 0; i < n; i++) {

            if (pref[i] > lastSum) {
                valid += freq[lastSum + shift];
            } else {
                valid -= freq[pref[i] + shift];
            }

            cnt += valid;

            freq[pref[i] + shift]++;

            lastSum = pref[i];
        }

        System.out.println("Number of majority subarrays: " + cnt);

        sc.close();
    }
}