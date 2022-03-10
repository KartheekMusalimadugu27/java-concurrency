package learn.java.thread.basics;

public class ThreadUnsafeCounter {
    
    
    int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    void printFinalCounterValue() {
        System.out.println("counter is: " + count);
    }

}
