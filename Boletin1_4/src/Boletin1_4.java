/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanNum1 = new Scanner(System.in);
        Scanner scanNum2 = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        float num1 = scanNum1.nextFloat();
        System.out.println("Introduce el segundo numero: ");
        float num2 = scanNum2.nextFloat();
        float suma = num1 + num2;
        float resta = num1 - num2;
        float producto = num1 * num2;
        float cociente = num1 / num2;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Cociente: " + cociente);
    }
    
}
