package sk.kosickaakademia.kolesarova.twothread;

import sk.kosickaakademia.kolesarova.homework.Calculator;

public class Consumer implements Runnable{
    private Calculator calculator;
    private Thread t;

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

    public void start() {
    }
}
