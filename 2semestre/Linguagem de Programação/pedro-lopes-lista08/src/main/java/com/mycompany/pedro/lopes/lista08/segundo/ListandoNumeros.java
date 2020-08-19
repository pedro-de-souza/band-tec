/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista08.segundo;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ListandoNumeros {

    public static void main(String[] args) {
        ListNumeros listNum = new ListNumeros();
        Scanner leitor = new Scanner(System.in);
        
        Integer numUserDigito;
        
        System.out.println("------------------------------------------------");
        
        do{
            System.out.print("Digite um número: ");
            numUserDigito = leitor.nextInt();
            if(numUserDigito!=0){listNum.addNumber(numUserDigito);}
        }while(numUserDigito != 0);
        
        listNum.todosNuns();
        listNum.imparNuns();
        listNum.parNuns();
        listNum.maiorNun();
        listNum.menorNun();
    }
}
