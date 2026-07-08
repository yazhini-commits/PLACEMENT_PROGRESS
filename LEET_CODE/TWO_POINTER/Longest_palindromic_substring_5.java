package LEET_CODE.TWO_POINTER;

public class Longest_palindromic_substring_5 {

    public static boolean isPalindrome(String s, int st, int e) {

        while (st < e) {
            if (s.charAt(st) != s.charAt(e)) {
                return false;
            }
            st++;
            e--;
        }

        return true;
    }

    public static String longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = s.length() - 1; j >= i; j--) {

                if (isPalindrome(s, i, j)) {

                    String temp = s.substring(i, j + 1);

                    if (temp.length() > ans.length()) {
                        ans = temp;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "babad";

        String result = longestPalindrome(s);

        System.out.println("Input : " + s);
        System.out.println("Longest Palindromic Substring : " + result);
    }
}