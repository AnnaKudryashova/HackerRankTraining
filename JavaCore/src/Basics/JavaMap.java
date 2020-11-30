package Basics;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int phone = sc.nextInt();
            phoneBook.addToBook(name, phone);
            sc.nextLine();
        }
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            System.out.println(phoneBook.getFromBook(s));
        }
    }
}
class PhoneBook {
    Map<String, Integer> phoneBook = new HashMap<>();
    void addToBook(String name, Integer phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }
    String getFromBook(String name) {
        if (phoneBook.containsKey(name)) {
            return name + "=" + phoneBook.get(name);
        } else {
            return "Not found";
        }
    }
}
