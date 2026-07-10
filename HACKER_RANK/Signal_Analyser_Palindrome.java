package HACKER_RANK;

import java.util.Scanner;

public class Signal_Analyser_Palindrome {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        boolean flag=true;
        Scanner sc= new Scanner(System.in);
        String st= sc.next();
        int l=0;
        int r=st.length()-1;
        while(l<=r){
            if(st.charAt(l)!=st.charAt(r)){
                flag=false;
                break;
            }
            l++;
            r--;
        }
        if(flag){
            System.out.println("YES");
            
        }
        else{
            System.out.println("NO");
        }
    }   
}