package Basics;
import java.util.Scanner;

public class JavaLoopsII {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = a;
            for (int j = 0; j < c; j++) {
                result = result + b * (int) Math.pow(2, j);
                System.out.print(result + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
