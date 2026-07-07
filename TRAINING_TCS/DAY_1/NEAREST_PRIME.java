import java.util.*;

public class NEAREST_PRIME {
    public static boolean isprime(int n) {
        int num = n;
        boolean prime = false;
        for (int i = 2; i <= Math.sqrt(num); i++) // i*i<=n we can give this condition also
        {

            if (num % i == 0) {
                prime = true;
                break;

            }

        }
        if (prime) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int k = 0; k < n; k++) {
            int z = sc.nextInt();
            int i = z;
            int j = z;
            while (true) {
                if (isprime(--i)) {
                    System.out.print(i);
                    break;
                } else if (isprime(++j)) {
                    System.out.println(j);
                    break;
                }
            }
        }

    }
}
