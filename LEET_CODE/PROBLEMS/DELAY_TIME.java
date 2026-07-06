package LEET_CODE.PROBLEMS;

import java.util.Scanner;

public class DELAY_TIME {

    // Function to find delayed arrival time
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter Arrival Time: ");
        int arrivalTime = sc.nextInt();

        System.out.print("Enter Delayed Time: ");
        int delayedTime = sc.nextInt();

        // Call function
        int result = findDelayedArrivalTime(arrivalTime, delayedTime);

        // Print result
        System.out.println("Delayed Arrival Time: " + result);

        sc.close();
    }
}