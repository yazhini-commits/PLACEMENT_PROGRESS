import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class COUNT_DISTINT{

    public static int distinctIntegers(int n) {

        if (n == 1) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();

        while (n > 2) {

            if (n % (n - 1) == 1) {
                set.add(n - 1);
            }

            n = n - 1;
        }

        return set.size() + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Distinct Integers = " + distinctIntegers(n));

        sc.close();
    }
}