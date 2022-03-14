package learn.java.thread.basics;

public class DeadLockDemo {
    
    public static void main(String[] args) {
        DeadLock deadlock = new DeadLock();
        try {
            deadlock.runTest();
        } catch (InterruptedException ie) {
        }
    }
}
