package sk.kosickaakademia.kolesarova.tutorialthread;

public class T1 implements Runnable {
    private Chat chat;
    private Thread t;
    private String[] s1={"Hi","How are you?","What are you doing?","Bye"};

    public T1(Chat chat) {
        this.chat = chat;
        t=new Thread(this,"Question");
        t.start();//v maine som si len vytvorila vlákno a tu ho spúšťam
    }

    @Override
    public void run() {
        for(String q:s1){
            chat.question(q);
        }
    }
}
