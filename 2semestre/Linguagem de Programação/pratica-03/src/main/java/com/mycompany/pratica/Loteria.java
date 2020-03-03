/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pedro.souza
 */
public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();
        Integer numLoteria, numSorteado, cont = 1;
        numSorteado = aleatorio.nextInt(10) + 1;
        
        System.out.print("Vamos testar sua sorte. Digite um numero entre 0 e 10: ");
        numLoteria = leitor.nextInt();
        
        if(numLoteria >= 0 && numLoteria <= 10){
            while(!(numLoteria.equals(numSorteado))){
                System.out.println(cont+"º tentativa. Número sorteado "+numSorteado);
                numSorteado = aleatorio.nextInt(10) + 1;
                cont++;
            }
            if(numLoteria.equals(numSorteado)){
                System.out.println(cont+"º tentativa. Número sorteado "+numSorteado);
                System.out.println("Acertou.");
                switch(cont){ 
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("Você é MUITO sortudo");
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        System.out.println("Você é sortudo");
                        break;
                    default:
                        System.out.println("É melhor você ser trabalhador");
                }
            }                    
        }
        else{
            System.out.println("Somente um numero entre 0 e 10");
        }
    }

}
