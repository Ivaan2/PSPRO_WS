package psp.UD01.progmultiproceso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ej8_repaso {
    public static void main(String[] args) {
        ArrayList<String> cmd = new ArrayList<String>();
        ProcessBuilder pb = new ProcessBuilder();
        Map<String, String> vEntronos = pb.environment();
        Iterator it = vEntronos.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String, String> e = (Map.Entry)it.next();
            //System.out.println(e.getKey() + e.getValue());
        }

        cmd.add("cmd");
        cmd.add("/c");
        //cmd.add("");
        cmd.add("help dir");

        ProcessBuilder pb2 = new ProcessBuilder(cmd);
        pb2.inheritIO();

        try {
            System.out.println("");
            pb2.start();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
