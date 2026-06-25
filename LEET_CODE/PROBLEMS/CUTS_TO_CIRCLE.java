package LEET_CODE.PROBLEMS;
import java.util.*;
public class CUTS_TO_CIRCLE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int result;

        if (n == 1) {
            result = 0;
        } else if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = n;
        }

        System.out.println("Number of cuts required: " + result);
    }
}