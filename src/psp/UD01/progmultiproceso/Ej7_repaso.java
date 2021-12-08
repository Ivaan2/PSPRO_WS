package psp.UD01.progmultiproceso;

import java.io.IOException;

public class Ej7_repaso {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder();
        String cmd = "C:/Program Files/Mozilla Firefox/firefox.exe";
        pb.command(cmd, "youtube.es/trending");


        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
