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
public class CalculosBasicos {
    public static void main(String[] args) {
        //TRABALHA COM CALCULO DE SOMA
        int numero1 , numero2,resultadoResto;
        double resultadoSoma , resultadoSubtracao , resultadoMultiplicacao , resultadoDivisao;
        
        Scanner entradaNumero = new Scanner (System.in);
        
        System.out.println("Digite um valor imteiro:");
        numero1= entradaNumero.nextInt();
        
        System.out.println("Digite utro valor intreiro:");
        numero2 = entradaNumero.nextInt();
       //Soma
       
       resultadoSoma= numero1 + numero2;
       
        System.out.println("A soma dos numeros e :"+resultadoSoma);
        //Subtracao
        resultadoSubtracao = numero1 - numero2;
        System.out.println("a subtracao dos numero e:"+ resultadoSubtracao);
        
        //Multiplicacao
       resultadoMultiplicacao = numero1 * numero2;
        System.out.println("A multiplicacao dos numeros e:"+resultadoMultiplicacao);
        //Divisao
        resultadoDivisao = numero1 / numero2;
        System.out.println("A divisao dos nurmeos e:"+resultadoDivisao);
        
        //Calculo de resto 
        
        resultadoResto = numero1 % numero2;
        System.out.println("o resto da divisao e:"+resultadoResto);
        
     
        
                
        
        
        
        
        
       
  }
}
