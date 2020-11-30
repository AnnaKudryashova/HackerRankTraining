package Basics;
import java.util.Scanner;

public class Array2D {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] array = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                array[i][j] = arrItem;
            }
        }
        scanner.close();
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int current_sum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                max_sum = Math.max(max_sum, current_sum);
            }
        }
        System.out.println(max_sum);
    }
}
