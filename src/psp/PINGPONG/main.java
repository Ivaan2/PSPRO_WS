package psp.PINGPONG;

import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        PingPong ping = new PingPong();

        Runnable partida = new Partida(ping);

        Thread Ping = new Thread(partida);

        Ping.start();
    }
}
