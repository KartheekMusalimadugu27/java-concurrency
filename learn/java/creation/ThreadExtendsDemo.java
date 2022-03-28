package learn.java.creation;

class Demonstration {
    public static void main(String args[]) throws Exception {
        ThreadExtendsDemo executeMe = new ThreadExtendsDemo();
        executeMe.start();
        executeMe.join();

    }
}

public class ThreadExtendsDemo extends Thread {

    @Override
    public void run() {
        System.out.println("I ran after extending Thread class");
    }
}
