package Basics;
import java.util.Scanner;
public class ExceptionHandling {
    public static final MyCalcul my_calculator = new MyCalcul();
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class MyCalcul {
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 || p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}
