package sk.kosickaakademia.kolesarova.homework;

public class Calculator {
    boolean flag=false;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public synchronized void multiply() {
        while (value < 1000) {
            if (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value = value * 2;
            System.out.println(value);
            flag = true;
            notify();
        }
    }


    public synchronized void add() {
        System.out.println(value);
        while (value < 1000) {
            if (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value = value + 3;
            if(value<1000) {
                System.out.println(value);
            }
            flag = false;
            notify();
        }
    }
}

