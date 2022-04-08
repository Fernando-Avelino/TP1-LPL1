/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
 valores da resistência e corrente elétrica que serão digitados. Utilize a lei
 de Ohm. 
 */
public class TP01Ex09 {
    public static void main(String args[]){
                
        double corrente; 
        double resistencia;
        double tensao;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite o valor da corrente");
        corrente = input.nextDouble();
        System.out.println(" Digite o valor da resistência");
        resistencia = input.nextDouble();
        //Existe mais duas formula na lei de Ohm totalizando três fórmulas.
        //conforme a lei de Ohm a formula é V(tensão) é igual a I(corrente) vezes R(resistência).
        tensao = corrente * resistencia;
        System.out.println("A tensão do equipamento é;" + tensao);
        
    }
    
}
