package poop12;

public class HiloRunnable implements Runnable{
    @Override
    public void run() {
        for( int i = 0; i < 10; ++i ){
            System.out.println("Interación " + i + " de " + Thread.currentThread().getName() );
        }
        System.out.println("Terminina el hilo" + Thread.currentThread().getName() );
    } 
}
