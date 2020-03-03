/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica;

import java.util.Scanner;

/**
 *
 * @author pedro.souza
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Calculando o valor de uma potência");
        
        System.out.print("Insira o valor da base: ");        
        Integer numBase = leitor.nextInt();
        
        System.out.print("Insira o valor do expoente: "); 
        Integer numExpoente = leitor.nextInt();
        double valor = Math.pow(numBase, numExpoente);
        System.out.print(String.format("\n%.0f", valor));
    }
}
