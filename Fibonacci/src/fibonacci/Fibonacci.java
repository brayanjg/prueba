/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    
   public static int FibonacciRecursivo(int n){
         if(n < 2)
            return 1;
         else
            return FibonacciRecursivo(n-1) + FibonacciRecursivo(n-2);
      }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int numero;
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
       
        System.out.println("F(" + numero + ")=" + FibonacciRecursivo(numero-1));
    }
    
}
