package psp.test.Ejemplo5;

public class Cliente implements Runnable {
    private Taxi taxi;
    private int numKm;
    private String nombreCliente;

    public Cliente(Taxi taxi, int numKm, String nombreCliente){
        this.taxi = taxi;
        this.numKm = numKm;
        this.nombreCliente = nombreCliente;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public int getNumKm() {
        return numKm;
    }

    public void setNumKm(int numKm) {
        this.numKm = numKm;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public void run() {
        taxi.iniciarTrayecto(this);
        taxi.finalizarTrayecto(this);
    }
}

