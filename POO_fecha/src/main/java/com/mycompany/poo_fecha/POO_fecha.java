
package com.mycompany.poo_fecha;

import java.util.Scanner;

/**
 *
 * @author Diego Lopez
 */
public class POO_fecha {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el dia, mes y año");
        int dia = lector.nextInt();
        
        Fecha fecha1 = new Fecha(dia,8,2023);
        System.out.println("-----------------------------");
        String fech = fecha1.fechaCorta();
        System.out.println("La fecha es " + fech);
    }
}
