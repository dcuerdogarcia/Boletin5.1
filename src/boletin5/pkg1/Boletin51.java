package boletin5.pkg1;

import java.util.Scanner;

public class Boletin51 {

    public static void main(String[] args) {
        
        Coche objetocoche1 = new Coche();
        System.out.println ("inserta valor para la aceleración: ");
        Scanner dato = new Scanner (System.in);
        objetocoche1.acelerar(dato.nextInt());
        System.out.println ("Aceleración: "+objetocoche1.aceleracion);
        
    }
    
}