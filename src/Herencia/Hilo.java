package Herencia;

public class Hilo extends Thread {
    public Hilo(){

    }
    @Override
    public void run(){
        System.out.println("Soy el hilo");
    }

}
