package psp.PINGPONG;

public class Partida implements Runnable{
    private PingPong p;
    public Partida (PingPong p){
        this.p = p;
    }

    @Override
    public void run(){
        //El nucle infinito en el metodo main no funciona, hay que indicarlo en la clase run
        while(true) {
            p.enviarGolpe();
            p.devolverGolpe();
        }
    }
}
