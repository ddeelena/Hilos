package Interfaz;

import Herencia.Hilo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main2 {
        public static void main(String[] args) {
/*            Hilo2 hilo = new Hilo2();
            hilo.run();
            System.out.println("Segundo");

            HiloNumeroLetras h1 = new HiloNumeroLetras(1);
            HiloNumeroLetras h2 = new HiloNumeroLetras(2);

            Thread t1 = new Thread(h1);
            Thread t2 = new Thread(h2);

            t1.start();
            t2.start();*/
            Contador c1 = new Contador("Contador 1", 40);
            Contador c2 = new Contador("Contador 2", 50);
            Contador c3 = new Contador("Contador 3", 20);
            Contador c4 = new Contador("Contador 4", 70);

            //Creamos los hilos
            Thread t1 = new Thread(c1);
            Thread t2 = new Thread(c2);
            Thread t3 = new Thread(c3);
            Thread t4 = new Thread(c4);

            //Iniciamos los hilos
            t1.start();
            t2.start();
            t3.start();
            t4.start();

            //Esperamos a que acaben los hilos
            try {
                t1.join();
                t2.join();
                t3.join();
                t4.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Fin
            System.out.println("Fin del programa");

        }


}
