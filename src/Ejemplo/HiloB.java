package Ejemplo;

public class HiloB extends Thread{
    private String  sexto = "Gran Estilo ";
    private String  septi = "De Un ";

    @Override
    public void run() {
        try{
            Thread.sleep(500);
            System.out.print(sexto +"\n"+  septi );
        }catch(InterruptedException e){
            System.out.println("Error in Class Thread 1"+e);
        }
    }
}
