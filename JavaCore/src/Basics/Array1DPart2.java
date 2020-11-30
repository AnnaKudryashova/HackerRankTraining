package Basics;
import java.util.Scanner;
public class Array1DPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            int leap = sc.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = sc.nextInt();
            }
            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
    }
    public static boolean canWin(int leap, int[] game) {
        return isWinner(0, leap, game);
    }
    public static boolean isWinner(int i, int leap, int[] game) {
        if (i >= game.length) return true;
        if (i < 0 || game[i] == 1) return false;
        game[i] = 1;
        return isWinner(i + leap, leap, game) || isWinner(i + 1, leap, game) || isWinner(i - 1, leap, game);
    }
}
