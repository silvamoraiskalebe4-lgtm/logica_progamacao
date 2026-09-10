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
public class Exemplo2 {
public static void main(String[] args) {
    //variaveis
    int quantidadeMiojo, quantidadeSalada;
    
    // sacanner
    Scanner entradaNumero = new Scanner (System .in);
    
    // SOlicitar os dados ára usuário
    System.out.println("A quantos dias voce nao come miojo?");
    quantidadeMiojo= entradaNumero.nextInt();
     System.out.println("QUantos dias voce nao come salada");
     quantidadeSalada = entradaNumero.nextInt();
   
     /* se a quantidade de miojo for menor que 2 
ou quantidade de sakada fior maior que 7 a eesia vai ser ouci saúdavel*/ 
     if (quantidadeMiojo<2 || quantidadeSalada>7){
         System.out.println("Pouco saudadvel!!");}
         if (quantidadeMiojo>=2 || quantidadeSalada<7){
             System.out.println("Saudavel!!");}
         
         
             
     }
     }
     
     
    
    

