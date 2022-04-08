/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 

Autores: Fernando Avelino 
	 Vinícius Nunes
*/
public class TP01Ex04 {
    public static void main (String args[]){

    double base;
    double altura;
    double area;
    
    Scanner input = new Scanner(System.in);
        
    System.out.println("Digite o valor da Base");
    base = input.nextDouble();
    
    System.out.println("Digite o valor da Altura");
    altura = input.nextDouble();
    
    area = (base*altura)/2;
    System.out.println("O Resultado da area do Triângulo é: " + area); 
    
    }
}
