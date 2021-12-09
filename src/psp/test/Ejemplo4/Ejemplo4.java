package psp.test.Ejemplo4;

public class Ejemplo4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria(40);
        UsuarioCuentaBancaria hJesus = new UsuarioCuentaBancaria("Jesús", cb);
        UsuarioCuentaBancaria hManuela = new UsuarioCuentaBancaria("Manuela", cb);

        hJesus.start();
        hManuela.start();
    }
}