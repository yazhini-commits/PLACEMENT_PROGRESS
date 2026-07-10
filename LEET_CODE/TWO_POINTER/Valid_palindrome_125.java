package LEET_CODE.TWO_POINTER;

public class Valid_palindrome_125 {

    static class Solution {

        public boolean isPalindrome(String s) {

            int l = 0;
            int r = s.length() - 1;

            while (l < r) {

                while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                    l++;
                }

                while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                    r--;
                }

                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                }

                l++;
                r--;
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + obj.isPalindrome(s1));

        System.out.println();

        String s2 = "race a car";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + obj.isPalindrome(s2));

        System.out.println();

        String s3 = " ";
        System.out.println("Input: \"" + s3 + "\"");
        System.out.println("Output: " + obj.isPalindrome(s3));

        System.out.println();

        String s4 = "0P";
        System.out.println("Input: " + s4);
        System.out.println("Output: " + obj.isPalindrome(s4));
    }
}