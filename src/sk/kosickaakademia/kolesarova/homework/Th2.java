package sk.kosickaakademia.kolesarova.homework;

public class Th2 implements Runnable{
    private Calculator calc;
    private Thread t;
    private int value;

    public Th2(Calculator calc) {
        this.calc = calc;
        t= new Thread(this,"Addition");
        t.start();
    }

    @Override
    public void run() {
        calc.add();
    }
}
