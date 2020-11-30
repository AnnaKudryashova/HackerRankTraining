package Basics;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(sc.nextInt());
        }
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            String action1 = sc.next();
            if (action1.equalsIgnoreCase("Insert")) {
                list.add(sc.nextInt(), sc.nextInt());
            } else {
                list.remove(sc.nextInt());
            }
        }
        sc.close();
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
