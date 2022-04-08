/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado. 
 */
public class TP01Ex03 {
    public static void main(String args[]){
    
        double diagonal;
        double area;
                
        Scanner input = new Scanner(System.in);
	
        System.out.println("Digite o valor da Diagonal");
	diagonal = input.nextDouble();
        
        System.out.println("Digite a unidade de medida");
        String unidade= input.next();

        area = (diagonal*diagonal)/2;
	System.out.println("A Area do Quadrado é: " + area + unidade);
        }
    }   
