/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.souza.lista06.primeiro;

import java.util.Random;



/**
 *
 * @author pedro
 */
public class ProgramaCampeonato {
    public static void main(String[] args) {
        Clube clubeBarcelona = new Clube();
        Clube clubeReal = new Clube();
        
        Random random = new Random();
        
      
        
        
        System.out.println("\nComeça a temporada!");
        System.out.print("--------------------------------");
        for(Integer rodadas = 0; rodadas < 5; rodadas++){
            Boolean real = (random.nextInt(2) == 0);
            Boolean barcelona = (random.nextInt(2) == 0);
            
            
            if(real == true && barcelona == false){
                
                System.out.println("\nBarcelona perdeu nessa rodada");
                System.out.println("Real Madrid ganhou nessa rodada");
                clubeBarcelona.registrarDerrota();
                clubeReal.registrarVitoria();
                System.out.println("\nBarcelona pontos:" + clubeBarcelona.getPonto());
                System.out.println("Real Madrid pontos:" + clubeReal.getPonto());
                
            }else if(real == false && barcelona == true){
                System.out.println("\nBarcelona ganhou nessa rodada");
                System.out.println("Real Madrid perdeu nessa rodada");
                clubeBarcelona.registrarVitoria();
                clubeReal.registrarDerrota();
                System.out.println("\nBarcelona pontos:" + clubeBarcelona.getPonto());
                System.out.println("RealMadrid pontos:" + clubeReal.getPonto());
                
            }else{
                
                System.out.println("\nBarcelona empatou nessa rodada");
                System.out.println("Real Madrid empatou nessa rodada");
                clubeBarcelona.registrarEmpate();
                clubeReal.registrarEmpate();
                System.out.println("\nBarcelona pontos:" + clubeBarcelona.getPonto());
                System.out.println("Real Madrid pontos:" + clubeReal.getPonto());
                
            }    
            System.out.print("--------------------------------");
        }
        
        System.out.println("\nFinal de temporada:");
        
        System.out.println("\nBarcelona: "+ 
                clubeBarcelona.getVitoria()+" vitórias, "+
                clubeBarcelona.getEempate()+" empates e "+
                clubeBarcelona.getDerrota()+" derrotas."
        );
        System.out.println(String.format("Total de pontos: %d", clubeBarcelona.getPonto()));
        
        System.out.println("\nReal Madrid: "+ 
                clubeReal.getVitoria()+" vitórias, "+
                clubeReal.getEempate()+" empates e "+
                clubeReal.getDerrota()+" derrotas."
        );
        System.out.println(String.format("Total de pontos: %d", clubeReal.getPonto()));
        
               

        
    }
}
