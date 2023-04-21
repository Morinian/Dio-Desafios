package edu.paula.desafios;

import java.util.Scanner;

public class FabrCarro {
    
    public static void main(String[] args) {
        
    /* 
    
    ~~~~ DESAFIO: Fábrica de Carros ~~~~
    
        O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos 
    (aplicados ao custo de fábrica). O gerente de uma loja de carros gostaria de um programa para calcular o preço de 
    um carro novo para os clientes. Você receberá o custo de fábrica e as porcentagens referentes ao distribuidor e os 
    impostos e deverá escrever programa para ler esses valores e imprimir o valor final do carro.
    
    */

    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Digite custo de fabrica:");
        int custFabrica = scan.nextInt();

        System.out.println("Digite a porcentagem do distribuidor");
	    int porcDistribuidor = scan.nextInt();

        System.out.println("Digite a porcentual de impostos");
	    int perclImpostos = scan.nextInt();

            int custoConsumidor;
            int Distribuidor;
            int ValorImpostos;
 
 
        Distribuidor = (custFabrica * porcDistribuidor ) / 100;
        ValorImpostos = (custFabrica * perclImpostos ) / 100;
        custoConsumidor = Distribuidor + ValorImpostos + custFabrica;

        System.out.println("O custo total do consumidor: " + custoConsumidor);
    }


    }
}
