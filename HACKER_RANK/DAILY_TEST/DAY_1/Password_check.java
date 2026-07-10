import java.io.*;
import java.util.*;

public class Password_check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            System.out.println(-1);
            return;
        }

        String s = sc.next();

        if (s == null || s.length() % 2 == 0) {
            System.out.println(-1);
            return;
        }
        int res = Integer.parseInt(s.charAt(0) + "");
        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) == 'A') {
                int temp = Integer.parseInt(s.charAt(i + 1) + "");
                res = res & temp;
            } else if (s.charAt(i) == 'B') {
                int temp = Integer.parseInt(s.charAt(i + 1) + "");
                res = res | temp;
            } else {
                int temp = Integer.parseInt(s.charAt(i + 1) + "");
                res = res ^ temp;
            }
        }
        System.out.println(res);
    }
}