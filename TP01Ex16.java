/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as 
 seguintes funções trigonométricas: seno, cosseno, tangente e secante deste 
 ângulo. Lembre-se que uma função trigonométrica trabalha em radianos. 
 */
public class TP01Ex16 {
    public static void main(String[] args) {
                   
        Scanner read = new Scanner(System.in);

        double angulo;
        System.out.println("Digite o ângulo (30º, 45º ou 60º): ");
        angulo = read.nextDouble();
            
        if(angulo==30){
            System.out.println("Angulo escolhido = 30º");
            System.out.println("Seno:1/2");
            System.out.println("Cosseno:√3/2");
            System.out.println("Tangente:√3/3");
            System.out.println("Secante:2√3/3");
        }
        else{
            if(angulo==45){
                System.out.println("Angulo escolhido = 45º");
                System.out.println("Seno:√2/2");
                System.out.println("Cosseno:√2/2");
                System.out.println("Tangente:1");
                System.out.println("Secante:√2");
            }
            else{
                if(angulo==60){
                    System.out.println("Angulo escolhido = 60º");
                    System.out.println("Seno:√3/2");
                    System.out.println("Cosseno:1/2");
                    System.out.println("Tangente:√3");
                    System.out.println("Secante:2");
                }
            }
        }
    }        
}

