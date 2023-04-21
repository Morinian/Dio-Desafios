package edu.paula.desafios;

import java.util.Scanner;

public class ImprPositivoMedia {
    public static void main(String[] args) {
        
            /*

                ~~~ DESAFIO: Imprimindo Positivos e Média ~~~~

                Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
            Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, 
            com um dígito após o ponto decimal.

             */


        try (Scanner scan = new Scanner(System.in)) {
            
            float numero;
            float soma = 0;
            int positivo = 0;
   
            int count = 0;
            do {
                System.out.println("Número: ");
                numero = scan.nextFloat();
   
                soma = soma + numero;

                if (numero>0) positivo = positivo+1;
   
                count = count + 1;

            } while(count < 6);
   
            System.out.println("Média: " + (soma/6));
            System.out.println("Quantidade de numeros positivos: " + positivo);


        }
    
        
    }
}
