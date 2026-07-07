public class DAY_3 {

    public static long sumAndMultiply(int n) {
        int sum = 0;
        long rev = 0;
        int num = n;

        // Build reversed non-zero number and calculate sum
        while (num > 0) {
            int digit = num % 10;

            if (digit != 0) {
                sum += digit;
                rev = rev * 10 + digit;
            }

            num /= 10;
        }

        // Reverse again to restore original order
        long ans = 0;

        while (rev > 0) {
            ans = ans * 10 + (rev % 10);
            rev /= 10;
        }

        return ans * sum;
    }

    public static void main(String[] args) {
        int n = 102304;

        long result = sumAndMultiply(n);

        System.out.println("Result: " + result);
    }
}