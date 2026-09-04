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
public class Questao3
{

    public static void main(String[] args) {
        int valor1;
        int valor2;
        Scanner entradaNumero= new Scanner (System.in);
        
        System.out.println("Digite o valor1");
        valor1 = entradaNumero.nextInt();
        
        System.out.println("Digite o valor2");
        valor2 = entradaNumero.nextInt();
        
        double media = (valor1 + valor2)/ 2;
        System.out.println("A media e:"+media);
        
        
    }
    
    
}
