/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanEuros = new Scanner(System.in);
        Scanner scanCambio = new Scanner(System.in);
        System.out.println("Introduce la cantidad de Euros a cambiar: ");
        float euros = scanEuros.nextFloat();
        System.out.println("Introduce la tasa de cambio € -> $: ");
        float cambio = scanCambio.nextFloat();
        float dolares = euros * cambio;
        System.out.println("En dolares = " + dolares);
        
    }
    
}
