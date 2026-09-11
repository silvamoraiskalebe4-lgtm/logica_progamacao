/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author KalebeMorais
 */
public class DesafioSwitchCase {
public static void main(String[] args) {
    
    int numeroProduto, quantidade;
    double valorTotal;
    
    Scanner entradaNumero = new Scanner (System.in);
    
    
     System.out.println("=====LANCHONETE======");
     System.out.println("1 - Hanburguer......15,00\n2 - Pizza......25,00\n3 - Cachorro-Quente......12,00\n4 - Refigerante.....6,00\n5 - Suco......8,00");
    
     
    System.out.println(" Diga o numero do produto:");
    numeroProduto = entradaNumero.nextInt();
    System.out.println("Diga a quantidade do produto:");
    quantidade= entradaNumero.nextInt();
    switch (numeroProduto){
    case 1:
        
        valorTotal = 15 * quantidade;
         System.out.println("PEDIDO");
         System.out.println("Produto: Hanburguer\nQuantidade:"+quantidade+"\nPreco unitario:15,00\n"+"Valor total:"+valorTotal);
        break;
        
    case 2:
        valorTotal = 25* quantidade;
        System.out.println("Produto:Pizza\nQuantidade:"+quantidade+"\nPreco unitario:25,00\n"+"Valor total:"+valorTotal);
        break;
       
    case 3 :
        valorTotal = 12 * quantidade;
        System.out.println("Produto: Cachorro-Quente\nQuantidade:"+quantidade+"\nPreco unitario:12,00\n"+"Valor total:"+valorTotal);
        break;
    case 4 :
        valorTotal = 6 *quantidade;
         System.out.println("Voce escolheu Refrigerante 6.00"+valorTotal+"quantidade foi" +quantidade);
         break;
    case 5:
        
        valorTotal = 8*quantidade;
        System.out.println("Voce escolheu Suco 8"+valorTotal+"quantidade foi"+quantidade);
       break;
    default: 
        System.out.println("Opacao e producao invalido!");
        
        break;
    }
            
    
    
}
    
}
