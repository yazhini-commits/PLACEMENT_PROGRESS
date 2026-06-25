package LEET_CODE.PROBLEMS;

import java.util.Scanner;

public class NUMBER_OF_MATCHES {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teams: ");
        int n = sc.nextInt();

        int ans = 0;

        while (n > 1) {

            if (n % 2 == 0) {
                ans += n / 2;
                n = n / 2;
            } else {
                ans += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        System.out.println("Total number of matches: " + ans);

        sc.close();
    }
}