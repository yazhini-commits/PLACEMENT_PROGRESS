package LEET_CODE.PROBLEMS;

import java.util.Scanner;

public class K_ITEMS {

    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        if (k <= numOnes) {
            return k;
        } else if (k <= numOnes + numZeros) {
            return numOnes;
        } else {
            return numOnes - (k - numOnes - numZeros);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Ones: ");
        int numOnes = sc.nextInt();

        System.out.print("Enter number of Zeros: ");
        int numZeros = sc.nextInt();

        System.out.print("Enter number of Negative Ones: ");
        int numNegOnes = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k);

        System.out.println("Maximum Sum = " + result);

        sc.close();
    }
}
