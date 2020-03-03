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
public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número para ver a tabuada do mesmo: ");
        Integer numTabuada = leitor.nextInt();
        
        for(Integer cont = 1; cont <= 10; cont ++ ){
            System.out.println(String.format("%d X %d = %d ", numTabuada, cont , (cont*numTabuada)));
        }
    }
}
