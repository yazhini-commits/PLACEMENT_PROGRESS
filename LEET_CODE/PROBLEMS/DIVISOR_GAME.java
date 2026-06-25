package LEET_CODE.PROBLEMS;

import java.util.Scanner;

public class DIVISOR_GAME {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        boolean result;

        if (n % 2 == 0) {
            result = true;
        } else {
            result = false;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}