package GrupoHilos;

public class ClaseMain {
    
    public static void main(String[] args) {
        ThreadGroup grupohilos = new ThreadGroup("Grupo con prioridad normal");
        Thread hilo1 = new grupoHilos( grupohilos, "Hilo 1 con prioridad máxima");
        Thread hilo2 = new grupoHilos( grupohilos, "Hilo 2 con prioridad normal");
        Thread hilo3 = new grupoHilos( grupohilos, "Hilo 3 con prioridad normal");
        Thread hilo4 = new grupoHilos( grupohilos, "Hilo 4 con prioridad normal");
        Thread hilo5 = new grupoHilos( grupohilos, "Hilo 5 con prioridad normal");
        
        hilo1.setPriority(Thread.MAX_PRIORITY);
        grupohilos.setMaxPriority(Thread.NORM_PRIORITY);
        System.out.println("Maxima prioridad del grupo " + grupohilos.getMaxPriority() );
        
        System.out.println("Prioridad Hilo 1 = " + hilo1.getPriority());
        System.out.println("Prioridad Hilo 2 = " + hilo2.getPriority());
        System.out.println("Prioridad Hilo 3 = " + hilo3.getPriority());
        System.out.println("Prioridad Hilo 4 = " + hilo4.getPriority());
        System.out.println("Prioridad Hilo 5 = " + hilo5.getPriority());
        System.out.println("\n\n\n"); 
       
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        
        listaHilos(grupohilos);
    }
    
    public static void listaHilos(ThreadGroup grupoActual){
        int numHilos;
        Thread[] listaDeHilos;
        numHilos = grupoActual.activeCount();
        listaDeHilos = new Thread[numHilos];
        grupoActual.enumerate(listaDeHilos);
        System.out.println("Num Hilos activos: " + numHilos);
        for(int i = 0; i < numHilos; ++i){
            System.out.println("Hilo activo " +i+ " = "+ listaDeHilos[i].getName());
        }
    }    
}
