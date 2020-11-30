package Basics;
public class SingletonPattern {
    /**
     * The Singleton pattern is a design pattern that restricts the instantiation of a class
     * to one object. This is useful when exactly one object is needed to coordinate actions across the system.
     */
    private SingletonPattern() {
    }
    public String str;
    private static SingletonPattern instance;
    public static SingletonPattern getSingleInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
    void getHello (String s) {
        System.out.printf("Hello I am singleton! Let me say %s to you", s);
    }
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getSingleInstance();
        singletonPattern.getHello("hello world");
    }
}
