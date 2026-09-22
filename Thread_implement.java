package CIET;

public class Thread_implement implements Runnable {

    public void run() {
        System.out.println("task running");
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new Thread_implement());
        thread.start();

    }
}