public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {} // private constructor

    public static Singleton getInstance() {
        return instance;
    }

    public void printSomething() {
        System.out.println("Something");
    }
}

