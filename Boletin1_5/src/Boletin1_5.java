/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int millasNauticasAMetros = 1852;
        Scanner scanMillasNauticas = new Scanner(System.in);
        System.out.println("Introduce las millas nauticas: ");
        float millasNauticas = scanMillasNauticas.nextFloat();
        float distanciaEnMetros = millasNauticas * millasNauticasAMetros;
        System.out.println("Distancia En Metros: " + distanciaEnMetros + "mts.");
    }
    
}
