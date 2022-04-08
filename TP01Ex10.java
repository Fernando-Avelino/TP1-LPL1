/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular 
 e exibir sua temperatura equivalente em Fahrenheit. 
 
 Autores: Fernando Avelino 
	  Vinícius Nunes
 */
public class TP01Ex10 {
    public static void main(String[] args) {

	Scanner read = new Scanner(System.in);
		
	double celsius, fahrenheit;
		
	System.out.println("Digite o valor da temperatura em Celsius: ");
	celsius = read.nextDouble();
		
	fahrenheit = (celsius * (9/5)) + 32;
		
	System.out.println("Valor da temperatura em Fahrenheit é igual a: " + fahrenheit);
		
    }
    
}
