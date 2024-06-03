package Threads;

public class MyThread extends Thread {
    private volatile boolean running = true;
    public void run(){
        int count = 0;
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I'm thread, iteration: "+count++);
        }
    }
    public void shutDown(){
        this.running = false;
    }
}