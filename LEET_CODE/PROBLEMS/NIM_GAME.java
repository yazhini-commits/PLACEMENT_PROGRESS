package LEET_CODE.PROBLEMS;

import java.util.Scanner;

public class NIM_GAME {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        boolean result;

        if (n % 4 == 0) {
            result = false;
        } else {
            result = true;
        }

        System.out.println("Can win Nim Game: " + result);

        sc.close();
    }
}