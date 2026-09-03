/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author KalebeMorais
 */
// inportando as bibliatecas do Scanner
import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args)
    {//codigo para cadastrar o pet
        String nome;
        String raca;
        int idade;
        double peso;
        boolean foiVacinado;
        // crindo a s variaveis de capitura de dados 
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaLogica = new Scanner (System.in);
          System.out.println("digite o nome do seu pet:");
          nome= entradaTexto.nextLine();
          System.out.println("Digite a raca do seu pet:");
          raca = entradaTexto.nextLine();
          System.out.println("Digite a idade do seu pet");
          idade = entradaNumero.nextInt();
          System.out.println("Digite o peso don seu pet");
          peso= entradaNumero.nextDouble();
          System.out.println("Seu pet e vacinado ?");
          System.out.println("digite 1 para sim," +
                  "ou 0 para nao");
          foiVacinado= entradaLogica.hasNext();
          
          System.out.println("Bem-vindo(a) "+nome);
        System.out.println("VOce e da raca "+ raca+" e tem "+ idade+ "anos");
        System.out.println("Seu dono iormau seu peso e "+ peso+" kg");
        System.out.println("E que seu status de vacina e "+foiVacinado);  
                
          
          
                
        
        
    
    
    
    
    }
    
    
}
