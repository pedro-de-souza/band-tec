/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.cofrinho;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Aleatorio {
    Random random =  new Random();
    Integer barra = 0;
    
   void barraValue(){
       barra = random.nextInt(101);
   }
   
}
