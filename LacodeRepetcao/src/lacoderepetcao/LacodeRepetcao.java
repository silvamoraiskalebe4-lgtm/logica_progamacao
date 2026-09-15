/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lacoderepetcao;

import java.util.Scanner;

/**
 *
 * @author KalebeMorais
 */
public class LacodeRepetcao {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
     // laco de repetcao
     
     Scanner entradaTexto=new Scanner (System.in);
     
     String [] listaConvidados =new String[20];
     
     //asolicitar que a dona da festa preencha a lista
     
     for(int cont=0;cont<=19;cont++){
         System.out.println("digite o nome do convidados:");
     listaConvidados [cont]= entradaTexto.nextLine();
     }
     // imprimir a lista de convidados 
     
     for(int cont=0;cont<=19;cont++){
     
         System.out.println("convidados"+cont+":"+listaConvidados[cont]);
     
     
}

}
}