package psp.UD01.progmultiproceso;

import java.io.*;
import java.util.ArrayList;

public class dir {
    public static void main(String[] args) {
        metodoPB();
        metodoRT();
    }

    private static void metodoRT() {
        Runtime rt = Runtime.getRuntime();
        String cmd = "CMD /C DIR";

        Process p;
        InputStream is;
        BufferedReader filtroLectura;
        PrintWriter pw = null;

        try {
            p = rt.exec(cmd);
            int n = p.waitFor();
            is = p.getInputStream();

            pw = new PrintWriter(new FileWriter("src/psp/Actividad3.txt"));

            String linea;
            if(n != 0){
                System.out.println("Error en tiempo de ejecución");
            }else {
                filtroLectura = new BufferedReader(new InputStreamReader(is));
                while ((linea = filtroLectura.readLine()) != null) {
                    System.out.println(linea);
                    pw.println(linea);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (pw != null){
                pw.close();
            }
        }
    }

    private static void metodoPB() {
        ArrayList<String> cmd = new ArrayList<String>();
        cmd.add("CMD");
        cmd.add("/C");
        cmd.add("DIR");
        ProcessBuilder pb = new ProcessBuilder(cmd);

        pb.environment();
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
