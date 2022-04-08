/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir 
 o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. 
 
 Autores: Fernando Avelino 
	  Vinícius Nunes
 */
public class TP01Ex17 {
    
    
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double x, y, result;
		
		System.out.println("Digite o valor da base x: ");
		x = read.nextDouble();
		
		System.out.println("Digite o valor do expoente y: ");
		y = read.nextDouble();
		
		result = Math.pow(x, y);
		
		System.out.println("Resultado: " + result);

	}   
}
