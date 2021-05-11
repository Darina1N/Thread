package sk.kosickaakademia.kolesarova.tutorialthread;

public class Main {
    public static void main(String[] args) {
        Chat chat=new Chat();
        new T1(chat);//stačí mi objekt triedy T1 nepotrebujem premennú, lebo s ňou viac nepracujem, potrebujem len spustiť
        new T2(chat);
    }
}
