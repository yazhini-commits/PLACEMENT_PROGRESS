import java.util.*;

public class PRIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        boolean prime = false;
        if (num == 1) {
            System.out.println("Neither prime nor composite");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) // i*i<=n we can give this condition also
            {

                if (num % i == 0) {
                    prime = true;
                    break;

                }

            }
            if (prime) {
                System.out.println("Not prime");
            } else {
                System.out.println("prime");
            }
        }

    }
}
