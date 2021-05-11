package sk.kosickaakademia.kolesarova.homework;

public class Th1 implements Runnable{
    private Calculator calc;
    private Thread t;
    private int value;

    public Th1(Calculator calc, int value) {
        this.calc = calc;
        this.value=value;
        calc.setValue(value);
        t = new Thread(this,"Multiplication");
        t.start();
    }

   @Override
    public void run() {
        calc.multiply();
    }
}
