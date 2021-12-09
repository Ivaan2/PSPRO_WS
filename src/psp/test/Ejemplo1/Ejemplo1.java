package psp.test.Ejemplo1;

public class Ejemplo1{

    public static void main(String[] args) {
        Ejemplo1Thread h = null;
        for (int i = 0; i < 3; i++) {
            h = new Ejemplo1Thread(i + 1); // crear hilo
            h.start(); // iniciar hilo
        }
        System.out.println("3 HILOS CREADOS...");
    }
}
