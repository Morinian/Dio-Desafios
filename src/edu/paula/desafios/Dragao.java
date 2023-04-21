package edu.paula.desafios;

import java.util.Scanner;

public class Dragao {

    public static void main(String[] args) {
        
        /*

            ~~~ DESAFIO:Dragão! ~~~ 

            Daenerys é a khaleesi dos Dothraki. Juntamente com Drogon, eles vão atrás do Tyrion, 
        para tentar dominar Westeros. Ela possui, além do seu dragãozinho, um rastreador que mede
        o nível de energia de qualquer ser vivo. Todos os seres com o nível menor ou igual a 8000, 
        ela considera como se fosse um inseto. Quando passa deste valor, que foi o caso do Drogon, 
        ela se espanta e grita “Mais de 8000”. Baseado nisso, utilize a mesma tecnologia e analise 
        o nível de energia dos seres vivos.

        */
    
            try (Scanner scan = new Scanner(System.in)) {
                int casos, poderDeLuta;
                System.out.println("Digite quantos casos temos: ");
                casos = scan.nextInt();
   
                for(int i = 0; i < casos; i++){

                    System.out.println("Digite seu poder: ");
                    poderDeLuta = scan.nextInt();

   
                    if(poderDeLuta <= 8000){
                        System.out.println("INSETO!!!");
                    } else {
                        System.out.println("MAIS DE 8000!!");
                    }
                }
            }
    }

}
    
