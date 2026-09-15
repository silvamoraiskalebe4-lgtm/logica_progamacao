/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveisconplexas;

import java.util.Scanner;

/**
 *
 * @author KalebeMorais
 */
public class Matriz {
 public static void main(String[] args) {
        
     String[][] alunos = new String [11][2];
    alunos [0][0] = "Jordana";
    alunos [1][0]= "Geovana";
    alunos [2][0]="Kawan";
    alunos [3][0]="kalebe";
    alunos [4][0]= "Arthur";        
    alunos [5][0]= "Antonio";
    alunos [6][0]="Enzo";
    alunos [7][0]= "Pedro";
    
    alunos [0][1]="Rogerio";
    alunos [1][1]= "Israel";
    alunos [2][1]="Arthur B.";
    alunos [3][1]="Cleiciane";
    alunos [4][1]= "Samra";
    alunos [5][1]= "Marya";
    alunos [6][1]= "Victor";
    alunos [7][1]= "Daniel";
    alunos [8][1]= "Raniely";
    
    int linha, coluna;
    Scanner entradaNumero = new Scanner(System.in);
  
     System.out.println("Digite a coluna desejada:");
    coluna =entradaNumero.nextInt();
     System.out.println("Digite a linha desejada:");
     linha = entradaNumero.nextInt();
     System.out.println(alunos[linha][coluna]);
     
 
     
    
    
     
     
}
   
}
