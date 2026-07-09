package LEET_CODE.TWO_POINTER;

public class Find_Index_of_First_Occurrence_28 {

    static class Solution {

        public int strStr(String haystack, String needle) {

            if (needle.length() == 0)
                return 0;

            int m = haystack.length();
            int n = needle.length();

            if (n > m)
                return -1;

            for (int i = 0; i <= m - n; i++) {

                int j = 0;

                while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }

                if (j == n) {
                    return i;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.strStr("sadbutsad", "sad")); // 0
        System.out.println(obj.strStr("leetcode", "leeto")); // -1
        System.out.println(obj.strStr("a", "a")); // 0
        System.out.println(obj.strStr("mississippi", "issip"));// 4
    }
}