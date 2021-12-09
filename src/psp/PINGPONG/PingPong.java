package psp.PINGPONG;

import psp.Cliente;

public class PingPong extends Thread {
    private String ping = "Ping";
    private String pong = "Pong";
    private boolean disponible = true;

    public synchronized void enviarGolpe() {
        //El algoritmo es sencillo, cuando da el primer golpa habilita el segundo golpe
        //y viceversa. Además,muestra por pantalla "ping" en el primer método y "pong",
        //en el segundo.

        while (!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        disponible = false;
        System.out.println(ping);
    }

    public synchronized void devolverGolpe() {
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        disponible = true;
        System.out.println(pong);
    }
}
