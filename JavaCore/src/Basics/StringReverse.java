package Basics;
import java.util.Scanner;
public class StringReverse {
    /**
     * A palindrome is a word, phrase, number, or other sequence of characters which reads the same
     * backward and forward.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean flag = true;
        int l = A.length();
        for (int i = 0; i < l; i++) {
            if (A.charAt(i) != A.charAt(l - 1))
                flag = false;
            l--;
        }
        System.out.println(flag ? "Yes" : "No");
    }
}
