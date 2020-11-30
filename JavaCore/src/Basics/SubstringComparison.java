package Basics;
import java.util.Scanner;
public class SubstringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.close();
        System.out.println(
                getSmallestAndLargest(s, k));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        for (int i = 0; i <= s.length() - k; i++) {
            String subString = s.substring(i, i + k);
            if (subString.compareTo(largest) > 0)
                largest = subString;
            if (subString.compareTo(smallest) < 0)
                smallest = subString;
        }
        return smallest + "\n" + largest;
    }
}
