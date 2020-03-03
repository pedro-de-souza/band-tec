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
public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Somando números. Só irá para se você digitar 0");
        System.out.print("Digite um numero: ");        
        Integer num = leitor.nextInt();
        Integer soma = num;
        while(!(num == 0)){
            System.out.print("Digite mais um numero: ");
            num = leitor.nextInt();
            soma+= num;
        }
        System.out.println("A soma de tudo é "+ soma);
      
    }
}
