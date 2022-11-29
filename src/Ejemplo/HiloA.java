package Ejemplo;

public class HiloA extends Thread{
    private String tercero = " Es Sentirse Bien ";
    private String cuarto = "Vistes ";
    private String quinto = "Con Lo Que ";

    @Override
    public void run() {

            try{
                Thread.sleep(500);
                System.out.print(tercero +"\n"+  quinto +"\n"+ cuarto );
            }catch(InterruptedException e){
                System.out.println("Error in Class Thread 1"+e);
            }

    }
}
