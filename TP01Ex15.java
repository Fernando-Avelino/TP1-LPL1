/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade 
  de dólares. Calcular e exibir o valor correspondente em Reais (R$). 
 
 Autores: Fernando Avelino 
	  Vinícius Nunes
 */
public class TP01Ex15 {
    
    public static void main(String[] args) {

	Scanner read = new Scanner(System.in);
	
	double cotacao, dolares, dolreal;
	
	System.out.println("Digite o valor da cota��o do dolar: ");
	cotacao = read.nextDouble();
	
	System.out.println("Digite o valor da quantidade em dolares: ");
	dolares = read.nextDouble();
		
	dolreal = cotacao * dolares;
		
	System.out.println("Digite o valor da quantidade em dolares: " + dolreal);
		
		
    }   
}
