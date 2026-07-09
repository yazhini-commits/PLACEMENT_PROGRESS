package LEET_CODE.TWO_POINTER;

public class First_unique_char_387 {

    static class Solution {
        public int firstUniqChar(String s) {

            for (int i = 0; i < s.length(); i++) {

                boolean unique = true;

                for (int j = 0; j < s.length(); j++) {

                    if (i != j && s.charAt(i) == s.charAt(j)) {
                        unique = false;
                        break;
                    }
                }

                if (unique) {
                    return i;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s1 = "leetcode";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + obj.firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + obj.firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + obj.firstUniqChar(s3));
    }
}