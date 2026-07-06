import java.util.*;

public class COUNT_UNIT_DIGIT {
    public static boolean isUnique(int n) {
        int[] arr = new int[10];
        while (n != 0) {
            arr[n % 10]++;
            n /= 10;
        }
        for (int i : arr) {
            if (i > 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower range: ");
        int l = sc.nextInt();
        System.out.println("Enter higher range: ");
        int h = sc.nextInt();
        int count=0;
        for (int i = l; i <= h; i++) {
        
            if (isUnique(i)) {
                count++;
            }
        }
        System.out.println("The count of unique digit is: "+count);

    }
}
