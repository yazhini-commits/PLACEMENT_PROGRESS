package DAY_2;

import java.util.*;

public class ANAGRAM {
    public static boolean isanagram(String s1,String s2){
        int[] arr = new int[26];
        if(s1.length()!=s2.length())return false;
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }for(int i:arr){
            if(i!=0)return false;
        }return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1 = sc.next();
        System.out.println("Enter String 2: ");
        String s2 = sc.next();
        boolean ana = false;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (!s2.contains(s1.charAt(i) + "")) {
                    ana = false;
                    break;
                } else {
                    ana = true;
                }
            }
        } else {
            ana = false;
        }
        //if (ana) {
           // System.out.println("Anagram");
        //} else {
          //  System.out.println("Not Anagram");
       // }

       if(isanagram(s1,s2)){
        System.out.println("Anagram");
       }
       else{
        System.out.println("Not Anagram");
       }

    }
}
