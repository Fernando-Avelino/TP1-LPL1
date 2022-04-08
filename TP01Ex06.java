/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados. 

Autores: Fernando Avelino 
	 Vinícius Nunes 
 */
public class TP01Ex06 {
    public static void main(String args[]){
        
        double v1;
        double v2;
        double v3;
        double v4;
        double media;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cálculo da média aritmética");  
        System.out.println("Digite o Primeiro valor");
        v1 = input.nextDouble();
        
        System.out.println("Digite o Segundo valor");
        v2 = input.nextDouble();
        
        System.out.println("Digite o Terceiro valor");
        v3 = input.nextDouble();
         
        System.out.println("Digite o Terceiro valor");
        v4 = input.nextDouble();
                
        media = (v1 + v2 + v3 +v4)/4;
        System.out.println("A Média Aritmética dos 4 valore digitados foram: " + media);
    }
    
}
