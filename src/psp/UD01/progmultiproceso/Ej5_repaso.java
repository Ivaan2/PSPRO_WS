package psp.UD01.progmultiproceso;

import java.io.*;

/*
Crea una clase Java cuyo método main lance un comando que provoque errores y pinte por pantalla la descripción del error
 */


public class Ej5_repaso {
    public static void main(String[] args) {
        String cmd = "CMD /C DIRRR";
        Runtime rt = Runtime.getRuntime();
        InputStream is;
        int status;

        BufferedWriter bw = null;
        try {
            Process p = rt.exec(cmd);
            status = p.waitFor();

            if(status != 0) {


                is = p.getErrorStream();
                String linea;
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                bw = new BufferedWriter(new FileWriter("src/psp/Actividad5.txt"));

                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    bw.write(linea);
                    bw.newLine();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
