package LEET_CODE.PROBLEMS;

import java.util.Scanner;

public class FIND_PIVOT {

    public static int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += i;

            int rightSum = total - leftSum + i;

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Pivot Integer = " + pivotInteger(n));

        sc.close();
    }
}