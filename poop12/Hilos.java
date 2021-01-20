package poop12;

public class Hilos {
    public static void main(String[] args) {
        /*
        HiloTheread hilo = new HiloTheread("Primer Hilo");
        hilo.start();
        new HiloTheread("Segundo hilo").start();
        System.out.println("Termina el hilo principal");
        */
        new Thread(new HiloRunnable(), "Primer Hilo Runnable").start();
        new Thread(new HiloRunnable(), "Segundo Hilo Runnable").start();
        System.out.println("Termina hilo Principal");
    }
}


