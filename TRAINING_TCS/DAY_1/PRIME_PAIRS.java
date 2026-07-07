import java.util.*;
public class PRIME_PAIRS {
    public static boolean isprime(int n ){
        int num=n;
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
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low range: ");
        int l= sc.nextInt();
        System.out.println("Enter high range: ");
        int h =sc.nextInt();
        int c=0;
        for(int i =l;i<=h-5;i++){
            if(isprime(i) && isprime(i+6)){
                c++;

            }
        }
        System.out.println("The count pair is: "+ c);
    }
}
