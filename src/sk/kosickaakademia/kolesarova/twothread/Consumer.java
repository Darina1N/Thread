package sk.kosickaakademia.kolesarova.twothread;

public class Consumer extends Thread{
    private Thread t;

    @Override
    public synchronized void start() {
        if(t==null) {
            t = new Thread(this, "consumer");
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Consumer running.");
        try {
            synchronized (this) {
                wait();
                System.out.println("Wake up");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
