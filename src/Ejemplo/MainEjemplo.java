package Ejemplo;

import javax.swing.*;
import java.util.concurrent.CompletableFuture;

public class MainEjemplo {
    public static void main(String[] args) {
        Hilo hilo = new Hilo();
        HiloA hiloA = new HiloA();
        HiloB hiloB = new HiloB();
        hilo.start();
        hiloA.start();
        hiloB.start();
        verificar();
    }

    public static void  verificar(){
        JOptionPane.showMessageDialog(null, "Reescriba correctamente la frase");
        String frase = "te dejo esta frase: la Secreto de un gran estilo es sentirse bien con lo que vistes";
        String user = JOptionPane.showInputDialog("Ingresa la frase");
        if(frase.equals(user)){
            JOptionPane.showMessageDialog(null,"Muy bien");
        }else {
            JOptionPane.showMessageDialog(null,"Lo siento, la frase es incorrceta");
        }
    }
}
