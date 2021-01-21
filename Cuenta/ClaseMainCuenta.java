package Cuenta;

public class ClaseMainCuenta {
   public static void main (String [] args) {
        new cuenta("Acceso 1: ").start(); 
        new cuenta("Acceso 2: ").start(); 
        new cuenta("Deposito 1: ").start(); 
        new cuenta("Deposito 2: ").start();
        System.out.println ("Termina el hilo principal");
    } 
}
