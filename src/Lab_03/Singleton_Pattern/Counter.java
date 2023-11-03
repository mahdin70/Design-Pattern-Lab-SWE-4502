package Lab_03.Singleton_Pattern;

public class Counter {
    private static Counter instance;
    private int count;

    private Counter() {
        count = 0;
    }

    public static synchronized Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
