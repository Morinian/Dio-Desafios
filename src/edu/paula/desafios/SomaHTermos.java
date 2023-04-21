package edu.paula.desafios;

import java.util.Scanner;

public class SomaHTermos {
    
    public static void main(String[] args) {

        /*

                ~~~ DESAFIO: Soma de H com N Termos ~~~~

                Neste desafio, faça um programa que calcule o valor de H com N termos. 
            Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 

        */


        try (Scanner scan = new Scanner(System.in)) {

            float h = 1;
            float c = 1;
            System.out.println("Digite o valor de N: ");
            float n = scan.nextFloat();
     
            
            for (int i = 1; i <= n; i++) {
               
                h = h + 1/c;
                c = c + i;
            }

            System.out.printf("Numero de termos = %.2f", (h));
        }

      
        
    }
}
