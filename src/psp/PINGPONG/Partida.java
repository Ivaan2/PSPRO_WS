package psp.PINGPONG;

public class Partida implements Runnable{
    private PingPong p;
    public Partida (PingPong p){
        this.p = p;
    }

    @Override
    public void run(){
        while(true) {
            p.enviarGolpe();
            p.devolverGolpe();
        }
    }
}
