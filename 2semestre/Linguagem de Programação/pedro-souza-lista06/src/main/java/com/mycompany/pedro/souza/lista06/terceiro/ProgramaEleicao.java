/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.souza.lista06.terceiro;

import java.util.Random;

/**
 *
 * @author pedro
 */
public class ProgramaEleicao {

    public static void main(String[] args) {

        UrnaEltronica urnaEltronica = new UrnaEltronica();
        Random random = new Random();
        
        System.out.println("\nComeçou a eleição:\n");
        for(Integer v = 0; v<15;v++){
            Integer votoPara = random.nextInt(2)+1;
            
            if(votoPara == 1){
                urnaEltronica.votarCandidato1();
                System.out.println("Candidato 1 recebeu 1 voto, totalizando: "+ urnaEltronica.getTotalCandidato1()+ "\n");
            }else{
                urnaEltronica.votarCandidato2();
                System.out.println("Candidato 2 recebeu 1 voto, totalizando: "+ urnaEltronica.getTotalCandidato2() + "\n");
            }
            
        }
        
        
        System.out.println("\nEleição encerrada!");
        System.out.println("--------------------------------");
        
        System.out.println("Total de votos: "+urnaEltronica.getTotalVotos());
        
        if(urnaEltronica.getTotalCandidato1()> urnaEltronica.getTotalCandidato2()){
            System.out.println("Resultado: candidato 1 venceu");
        }else if(urnaEltronica.getTotalCandidato2() > urnaEltronica.getTotalCandidato1()){
            System.out.println("Resultado: candidato 2 venceu");
        }else{
            System.out.println("Resultado: ocorreu um empate, faça um segundo truno");
        }
    }

}
