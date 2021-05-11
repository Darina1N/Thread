package sk.kosickaakademia.kolesarova.tutorialthread;

public class T2 implements Runnable{
    private Chat chat;
    private Thread t;
    private String[] s2={"Hello","I'm fine, thanks","I learn java","Good Bye"};

    public T2(Chat chat) {
        this.chat = chat;
        t=new Thread(this,"Answer");
        t.start();
    }

    @Override
    public void run() {
        for(String q:s2){
            chat.answer(q);
        }
    }
}
