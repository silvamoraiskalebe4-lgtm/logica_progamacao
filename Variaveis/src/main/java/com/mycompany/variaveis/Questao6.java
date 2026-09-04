/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author KalebeMorais
 */
public class Questao6 {
    public static void main(String[] args) {
       
        int numero1 , numero2;
        double resultadoSoma;
        
       Scanner entradaNumero = new Scanner (System.in) ;
       
        System.out.println("digite um valor:");
        numero1 = entradaNumero.nextInt();
        
         System.out.println("digite um valor:");
        numero2 = entradaNumero.nextInt();
        
        resultadoSoma= numero1+ numero2;
       
       System.out.println("Soma dos numeros e:"+resultadoSoma);
       
        
       
       
       
       
       
               
          
    }
}
