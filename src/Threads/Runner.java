package Threads;

public class Runner implements Runnable {
    private volatile boolean running;

    @Override
    public void run() {
        for (int i = 0; i < 500; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I'm a runner thread, iteration: "+i);
        }
    }
}