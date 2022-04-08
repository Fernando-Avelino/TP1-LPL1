/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado. 
 
 Autores: Fernando Avelino 
	  Vinícius Nunes
 */
public class TP01Ex05 {
    public static void main(String arg[]){
    
    double diametro;
    double volume;
    double raio;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite o valor do Diâmetro");
    diametro = input.nextDouble();
    
    raio = diametro/2;
    
    volume = (4/3.0) * PI * Math.pow(raio, 3);
    System.out.println("O volume da Esfera é:" + volume);
    
    }
    
}
