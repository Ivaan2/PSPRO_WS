package psp.UD01.progmultiproceso;

import java.io.IOException;
import java.util.ArrayList;

public class Ej11_repaso {
    public static void main(String[] args) {
        ArrayList<String> cmd = new ArrayList<String>();
        String ruta = Ej10_repaso.class.getCanonicalName();
        String classpath = Ej10_repaso.class.getClassLoader().getResource("").getPath();

        cmd.add("java");
        cmd.add(ruta);

        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.environment().put("CLASSPATH", classpath);

        pb.inheritIO();
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
