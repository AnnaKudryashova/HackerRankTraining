package Basics;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int numberOfLists = scanner.nextInt();
        for (int i = 0; i < numberOfLists; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int number = scanner.nextInt();
            for (int j = 0; j < number; j++) {
                int value = scanner.nextInt();
                list.add(value);
            }
            lists.add(list);
        }
        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            try {
                System.out.println(lists.get(a - 1).get(b - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
