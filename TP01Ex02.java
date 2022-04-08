/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
Autores: Fernando Avelino 
	 Vinícius Nunes
*/

public class TP01Ex02 {
    public static void main (String args[]){
               
        double aresta;
        double area;

        Scanner entrada = new Scanner(System.in);
	System.out.println("Digite o valor da Base");
        aresta = entrada.nextDouble();
	area = (aresta * aresta);
	System.out.println("A Area do triangulo eh " + area);
    
    }
}
