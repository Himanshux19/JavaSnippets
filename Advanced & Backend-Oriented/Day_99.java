// Day : 99 Multithreading using Runnable

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // simulate work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Day_99 {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}