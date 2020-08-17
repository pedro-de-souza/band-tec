/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.souza.lista06.segundo;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ProgramaCalculo {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Iniando programa calculadora...\n");
        
        System.out.print("Digite o primeiro número: ");
        Integer num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número:  ");
        Integer num2 = scanner.nextInt();
        
        System.out.println("\nResultados:");
        
        System.out.println(num1 + " + "+ num2 +" = "+ calculadora.opercaoAdicao(num1, num2));
        System.out.println(num1 + " - "+ num2 +" = "+ calculadora.opercaoSubtracao(num1, num2));
        System.out.println(num1 + " x "+ num2 +" = "+ calculadora.opercaoMultiplicacao(num1, num2));
        System.out.println(num1 + " ÷ "+ num2 +" = "+ calculadora.opercaoDivisao(num1, num2));
        
        
        System.out.print("\nPrograma encerrado.");
        
        
        
    }
}
