package learn.java.creation;

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Jishnav!");
            }
        });
        t.start();
    }
}
