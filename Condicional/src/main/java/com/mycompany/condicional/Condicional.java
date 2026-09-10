/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author KalebeMorais
 */
public class Condicional {

    public static void main(String[] args) 
   {/*Condicional é o codigo usado para avaliar dados, e s e for falso realizar 
       outra ação. SE-IF
       SENÃO-ELES
       TABELA LOGICA:
       > MAIOR QUE
       < MANOR QUE
       >= MOIR OU IGUAL
       <= MA=ENOR OU IGUAL
       == IGUAL
       =!DIFERENTE
       */
       int idade;
       Scanner entradaNumero = new Scanner (System.in);
       System.out.println("Digite sua idade:");
       idade= entradaNumero.nextInt();
       //análise da idade
       if(idade >=18){
           System.out.println("voce e maior de idade");
       
       } else {
       System.out.println("voce e menor de idade");
               
       }// fim do else 
    

    }
}

