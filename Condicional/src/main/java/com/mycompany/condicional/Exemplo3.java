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
public class Exemplo3 {
 public static void main(String[] args){
         //variavel
        
    int idadeP1, idadeP2 , idadeP3;
    // sacanner
    Scanner entradaNumero = new Scanner (System.in);
    
    //SOlicitar os dados so usuario
     System.out.println("Digite a idade da pessoa 1");
     idadeP1 = entradaNumero.nextInt();
     System.out.println("Digite idade pessoa 2");
     idadeP2 = entradaNumero.nextInt();
     System.out.println("Digite idiade pessoa3");
     idadeP3 = entradaNumero.nextInt();
      // Avaliando as odades 
      if (idadeP1>idadeP2|| idadeP1<idadeP3){
          System.out.println("pessoa 1 ganha brinde");
      }if (idadeP1>idadeP2 || idadeP1<idadeP3){
              System.out.println("Pessoa 1 ganha brinde");
          }if (idadeP2>idadeP3 && idadeP2>idadeP1){
              System.out.println("Pessoa 2 ganha brinde");
          } if(idadeP3<idadeP1 || idadeP3<idadeP2 && idadeP2>idadeP1){
              System.out.println("Pessoa 3 ganha brinde");
              
          }
      
      }
             
}

   

