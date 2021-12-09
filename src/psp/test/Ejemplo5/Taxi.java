package psp.test.Ejemplo5;

public class Taxi {
    private double precioImporte;
    private int kmCarretera;
    private double precioKm;
    boolean disponible;

    public Taxi(){
        precioKm = 2.5;
        disponible = true;
    }

    public synchronized void iniciarTrayecto(Cliente c){
        kmCarretera = 0;
        if(!disponible){
            try {
                wait(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(c.getNombreCliente() + " usa el taxi");
            disponible = false;
        }
    }

    public synchronized void finalizarTrayecto(Cliente c){
        kmCarretera = c.getNumKm();
        if(disponible){
            try {
                wait(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            precioImporte = calcularImporte();
            System.out.println(c.getNombreCliente() + " termina el servicio. Importe: " + this.precioImporte + " $.");
            disponible = true;
        }
    }

    private double calcularImporte() {
        return kmCarretera * this.precioKm;
    }
}
