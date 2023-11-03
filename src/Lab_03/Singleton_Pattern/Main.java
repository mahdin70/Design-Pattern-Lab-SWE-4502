package Lab_03.Singleton_Pattern;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();

        counter1.increment();
        counter2.increment();

        System.out.println("Counter 1 Count: " + counter1.getCount());
        System.out.println("Counter 2 Count: " + counter2.getCount());
    }
}
