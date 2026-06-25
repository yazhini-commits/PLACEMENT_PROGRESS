package LEET_CODE.PROBLEMS;

import java.util.*;

public class ADD_DIGIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        if (n == 0) {
            result = 0;
        } else if (n % 9 == 0) {
            result = 9;
        } else {
            result = n % 9;
        }
        System.out.println("The Digit is: " + result);
    }

}
