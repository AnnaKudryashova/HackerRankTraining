package Basics;
public class Generics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
    }
}
class Printer<T> {
    void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
