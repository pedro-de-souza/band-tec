/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pedro.souza
 */
public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();
        Integer numSorteado, numDigitado,numSortPar = 0,numSortImp = 0,qSorte=0;
        numSorteado = aleatorio.nextInt(100) + 1;
        
        System.out.print("Vamos testar sua sorte. Digite um numero entre 1 e 100: ");
        numDigitado = leitor.nextInt();
        
        if(numDigitado > 0 && numDigitado <= 100){
            for(Integer cont = 0; cont < 200; cont++){
                if(numSorteado % 2== 0){
                    numSortPar++;
                }
                else{
                    numSortImp++;
                }
                if(qSorte == 0 && numSorteado.equals(numDigitado)){
                    qSorte = cont;
                }
                numSorteado = aleatorio.nextInt(100) + 1;
            }
            System.out.println(String.format("Foram sorteados %d numeros pares", numSortPar));
            System.out.println(String.format("Foram sorteados %d numeros impares", numSortImp));
            System.out.println("O número que você digitou"+ (qSorte==0?" não ficou em numha posição":"ficou na "+ qSorte +" ° posição"));
        }
        else{
            System.out.println("Somente um numero entre 1 e 100");
        }
        
    }
}
