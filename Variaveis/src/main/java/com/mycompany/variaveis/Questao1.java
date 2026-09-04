/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author KalebeMorais
 */
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
    // criar variavel
    
        String nome;
        // chamar scanner
        
    Scanner entradaTexto= new Scanner (System.in);
      //Solicitar que o usuario digite seu nome
        System.out.println("Digite seu nome:");
        nome= entradaTexto.nextLine();
        
        //imprimir a mensagem
        System.out.println("Ola,"+nome+"!Seja bem-vindo(a) ao java.");
    
    }
    
}
