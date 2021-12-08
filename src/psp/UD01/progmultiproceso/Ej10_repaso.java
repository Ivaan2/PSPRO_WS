package psp.UD01.progmultiproceso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ej10_repaso {
    public static void main(String[] args) {
        ArrayList<String> cmd = new ArrayList<String>();
        ProcessBuilder pb = new ProcessBuilder();
        pb.environment().put("MI_NOMBRE", "Ivan");
        Map<String, String> vEnt = pb.environment();

        Iterator it = vEnt.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("");
        cmd.add("cmd");
        cmd.add("/c");
        cmd.add("echo");
        cmd.add("%MI_NOMBRE%");

        pb.command(cmd);
        pb.inheritIO();
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
