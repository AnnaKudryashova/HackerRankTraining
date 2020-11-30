package Basics;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
    /**
     * Exception handling is the process of responding to the occurrence during computation,
     * of exceptions - anomalous or exceptional requiring special processing - often changing
     * the normal flow of program execution.
     */
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n / m);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}