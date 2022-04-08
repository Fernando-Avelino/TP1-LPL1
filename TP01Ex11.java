/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. 
 Autores: Fernando Avelino 
	  Vinícius Nunes
 */
public class TP01Ex11 {
    public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
		
	double diametro, raio, area;
		
	System.out.println("Digite o valor do diametro do circulo: ");
	diametro = read.nextDouble();
		
	raio = diametro / 2;
		
	area = 3.14 * (raio * raio);
		
	System.out.println("O valor do diametro é igual a: " + area);

    }
    
}
