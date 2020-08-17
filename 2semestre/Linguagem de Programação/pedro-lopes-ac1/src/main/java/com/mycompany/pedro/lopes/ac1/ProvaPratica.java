/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.ac1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ProvaPratica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer horasVoo;
        Integer horasVooTotal = 0, cont = 0;
        
        System.out.print("Insira seu nome piloto: ");
        String nomePiloto = leitor.nextLine();
        
        do{
            System.out.print("De quantas horas foi seu último vôo? ");
            horasVoo = leitor.nextInt();
            
            if(horasVoo == 0 || horasVoo > 6 ) {
                System.out.println("\nQuantidade inválida! Não será registrada!");
            } else {
                horasVooTotal += horasVoo;
                cont++;
                System.out.println(String.format("\n%s agora tem um total de %d horas de vôo", nomePiloto,horasVooTotal));
            }
        }while(horasVoo >=0);
        System.out.println("\n---------------------------Parabéns piloto-----------------------------------");
        System.out.println(String.format("\n%s se aposentou após fazer %d vôos acumulando %d horas!\n", nomePiloto,cont,horasVooTotal));
        
        
        
        
        
        
    }
}
