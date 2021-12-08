package psp.UD01.progmultiproceso;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Ej9_repaso {
    public static void main(String[] args) {
        ArrayList<String> cmd = new ArrayList<String>();
        cmd.add("cmd");
        cmd.add("/c");
        cmd.add("dir");

        File aDes = new File("src/psp/destino.txt");
        File aErr = new File("src/psp/error.txt");

        ProcessBuilder pb = new ProcessBuilder(cmd);

        int status = 0;
        try {
            status = ((Process) pb.start()).waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

        if(status != 0){
            System.out.println("status: " + status);
            pb.redirectError(aErr);
        }else{
            System.out.println("status: " + status);
            pb.redirectInput(aDes);
        }
    }
}
