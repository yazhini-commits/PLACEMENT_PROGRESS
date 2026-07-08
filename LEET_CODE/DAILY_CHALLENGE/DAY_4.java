import java.util.Scanner;

public class DAY_4 {

    private static final int MOD = 1000000007;
    private static final int MAX = 100001;
    private static final int[] pow = new int[MAX];

    static {
        pow[0] = 1;
        for (int i = 1; i < MAX; i++) {
            pow[i] = (int) ((pow[i - 1] * 10L) % MOD);
        }
    }

    public static int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();

        // Prefix sum of digits
        int[] A = new int[n + 1];

        // Prefix compressed number (non-zero digits only)
        int[] B = new int[n + 1];

        // Count of non-zero digits
        int[] len = new int[n + 1];

        // Preprocessing
        for (int i = 0; i < n; i++) {

            int d = s.charAt(i) - '0';

            A[i + 1] = A[i] + d;

            if (d != 0) {
                B[i + 1] = (int) ((B[i] * 10L + d) % MOD);
                len[i + 1] = len[i] + 1;
            } else {
                B[i + 1] = B[i];
                len[i + 1] = len[i];
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1] + 1;

            long sub = ((long) B[l] * pow[len[r] - len[l]]) % MOD;
            long x = (B[r] - sub + MOD) % MOD;

            int sum = A[r] - A[l];

            ans[i] = (int) ((x * sum) % MOD);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit string: ");
        String s = sc.next();

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        int[][] queries = new int[q][2];

        System.out.println("Enter each query (l r):");

        for (int i = 0; i < q; i++) {

            int l = sc.nextInt();
            int r = sc.nextInt();

            // Validate query
            if (l < 0 || r >= s.length() || l > r) {
                System.out.println("Invalid Query: (" + l + ", " + r + ")");
                sc.close();
                return;
            }

            queries[i][0] = l;
            queries[i][1] = r;
        }

        int[] ans = sumAndMultiply(s, queries);

        System.out.println("\nAnswers:");

        for (int x : ans) {
            System.out.println(x);
        }

        sc.close();
    }
}