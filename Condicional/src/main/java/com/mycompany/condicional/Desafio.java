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
public class Desafio {
public static void main(String[] args) {
   
    
    String nome;
    int idade; 
    String ingresso; 
    boolean autorizacao = false;
    
    Scanner entradaTexto=new Scanner (System.in);
    Scanner entradaNumero=new Scanner (System.in);
    Scanner entradaLogica=new Scanner (System.in);
    
    System.out.println("Diga seu nome:");
    nome =entradaTexto.nextLine ();
    
    System.out.println("Fale sua idade");
    idade = entradaNumero.nextInt();
    
    System.out.println("Fale do tipo de ingresso ?");
    ingresso = entradaTexto.nextLine();
    
    System.out.println("Possui autorizacao?" + "True para sim ou false para nao");
    autorizacao = entradaLogica.nextBoolean();
    System.out.println("ola" +nome+ ",voce possui "+idade+"anos e");
    
    
    if (idade>=18 && ingresso.equals("VIP")){
        
        System.out.println("Acesso VIP liberado");
    }else if (idade>=18 && ingresso.equals("COMUM")){
        
    } else if((idade==16 || idade==17) && autorizacao==true){
        
    System.out.println("acesso liberado com Autorizacao!");
    }else if(ingresso.equals ("Professor") || ingresso.equals ("Funcionario")){
        
    System.out.println("Acesso Especial Liberado");
    }else{
        
    System.out.println("Acesso Negado!");
        
                        
 }
                
        
  
    }
    
            
    
    
}
    

