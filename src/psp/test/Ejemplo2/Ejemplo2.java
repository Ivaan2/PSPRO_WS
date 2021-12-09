package psp.test.Ejemplo2;

public class Ejemplo2  {
    public static void main(String[] args) {
        Ejemplo2Runnable ej2r = new Ejemplo2Runnable(10);
        Thread hRunnable = new Thread(ej2r);
        hRunnable.start();
    }
}