/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio 
 da base que serão digitados.
 
 Autores: Fernando Avelino 
	  Vinícius Nunes
 */
public class TP01Ex12 {
    public static void main(String[] args) {

	Scanner read = new Scanner(System.in);
		
	double altura, raio, volume;
		
	System.out.println("Digite o valor da altura do cone: ");
	altura = read.nextDouble();
	
	System.out.println("Digite o valor do raio do cone: ");
	raio = read.nextDouble();
		
	volume = (3.14 * (raio * raio) * altura) / 3;
		
	System.out.println("O volume do cone é igual a: " + volume);

    }
    
}
