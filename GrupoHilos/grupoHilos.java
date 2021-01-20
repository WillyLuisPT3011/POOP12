package GrupoHilos;

public class grupoHilos extends Thread{
    public grupoHilos(ThreadGroup g, String n){
        super(g,n);
    }
    
    @Override
    public void run(){
        for( int i = 0; i < 10; ++i ){
            System.out.println( getName() + " iteración " + i );
        }
    }
}
