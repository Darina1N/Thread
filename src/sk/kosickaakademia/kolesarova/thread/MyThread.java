package sk.kosickaakademia.kolesarova.thread;

public class MyThread implements Runnable{
    private String threadName;
    private Thread t;
    private int priority;

    @Override
    public void run() {//hlavná metóda ktorá spustí dané vlákno, tu bude prebiehať výpočet
        System.out.println("Running "+threadName);

            try{
                for(int i=1; i<=10;i++){
                    System.out.println("Thread "+threadName+": value: "+i);
                    Thread.sleep(1000);
            }
        }catch (InterruptedException e){
                e.printStackTrace();
            }
        System.out.println("Thread "+threadName+" ended.");
    }

    public MyThread(String threadName, int priority) {
        this.threadName = threadName;
        this.priority=priority;
        System.out.println("Creating "+threadName);
    }

    public void startik() {
        System.out.println("Starting " + threadName);
        if (t == null) {//chcem aby sa mi vlákno spustilo len 1
            t = new Thread(this, threadName);// cez this odkazujem na toto vlákno čiže na seba samé aby vedel že tu má run
            t.start();//cez metodu start ktorá je v triede Thread celé vlákno spúšťam a ono vie že cez start si zavolá run
        }
    }

}
