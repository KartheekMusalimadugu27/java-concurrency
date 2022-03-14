package learn.java.thread.basics;

public class ThreadDemonstration {
    public static void main(String args[]) throws InterruptedException {
        SumUpExample.runTest();
        RaceConditionThreadSafe.runTest();
        RaceConditionThreadUnSafe.runTest();
    }

  
}
