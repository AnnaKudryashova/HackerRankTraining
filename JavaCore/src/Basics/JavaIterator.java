package Basics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class JavaIterator {
    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String)
                break;
        }
        return it;
    }
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            myList.add(sc.nextInt());
        }
        myList.add("###");
        for (int i = 0; i < m; i++) {
            myList.add(sc.next());
        }
        Iterator it = func(myList);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
