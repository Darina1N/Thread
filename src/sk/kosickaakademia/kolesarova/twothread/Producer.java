package sk.kosickaakademia.kolesarova.twothread;

public class Producer extends Thread {
    private Thread t;

    @Override
    public synchronized void start() {
        System.out.println("Producer running.");
        try {
            synchronized (this) {
                wait();
            }
            System.out.println("Producer running again");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        if(t==null){
            t=new Thread(this,"producer");
            t.start();
        }
    }
}
