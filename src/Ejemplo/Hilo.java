package Ejemplo;

public class Hilo extends Thread{
     private String primero = "te dejo esta frase: ";
     private  String segundo = "El Secreto ";


    @Override
    public void run() {
        try{
            Thread.sleep(500);
            System.out.print(primero +"\n"+  segundo  );
        }catch(InterruptedException e){
            System.out.println("Error in Class Thread 1"+e);
        }
    }
}
