package psp.test.Ejemplo5;

public class SincronizacionTaxi {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        Runnable cliente1 = new Cliente(taxi, 17, "Eduardo");
        Runnable cliente2 = new Cliente(taxi, 1, "Felipe");
        Runnable cliente3 = new Cliente(taxi, 7, "María");
        Runnable cliente4 = new Cliente(taxi, 10, "Juan");

        Thread tcliente1 = new Thread(cliente1);
        Thread tcliente2 = new Thread(cliente2);
        Thread tcliente3 = new Thread(cliente3);
        Thread tcliente4 = new Thread(cliente4);

        tcliente1.start();
        tcliente2.start();
        tcliente3.start();
        tcliente4.start();
    }
}
