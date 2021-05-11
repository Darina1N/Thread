package sk.kosickaakademia.kolesarova.tutorialthread;

public class Chat {
    boolean flag=false; //podľa tohto budeme vedieť ktoré vlákno má ísť a ktoré stáť

    public synchronized void question(String msg){//metóda volaná z T1, používa wait a tak musí byť synchronized
        if(flag){//ak bude premenná tru tak vlákno T1 sa musí stopnúť
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag=true;
        notify();//zobudíme vlákno T2
    }

    public synchronized void answer(String msg){//metóda volaná z T2
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag=false;
        notify();
    }
}
