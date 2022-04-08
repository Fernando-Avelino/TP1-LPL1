/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados. 
  Autores: Fernando Avelino 
	          Vinícius Nunes
*/
public class TP01Ex07 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double valor[] = new double[2];
        double soma = 0;
        double mediag = 0;

        for(int i =0; i<2;i++){
            System.out.println("Digite o valor a ser calculado: ");
            valor[i] = read.nextDouble();
        }


        mediag = Math.sqrt(valor[0]*valor[1]);

        System.out.println("Média geométrica: " + mediag);
    }
    
}
