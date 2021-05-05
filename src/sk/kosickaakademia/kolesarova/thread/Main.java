package sk.kosickaakademia.kolesarova.thread;

public class Main {
    public static void main(String[] args) {
       /* MyThread thread1= new MyThread("Thread 1",2);
        thread1.startik();

        MyThread thread2= new MyThread("Thread 2",8);
        thread2.startik();*/

        PrimeNumberThread primeNumber= new PrimeNumberThread("primeThread",115628476);
        primeNumber.start();
    }
}
