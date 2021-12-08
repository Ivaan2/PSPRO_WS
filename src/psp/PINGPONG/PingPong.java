package psp.PINGPONG;

import psp.Cliente;

public class PingPong extends Thread {
    private String ping = "Ping";
    private String pong = "Pong";
    private boolean disponible = true;

    public synchronized void enviarGolpe() {
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
