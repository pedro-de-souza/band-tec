/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica;
import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Dadinho {
    Random aleatorio = new Random();
    
    void valueDado(){
        Integer valor = aleatorio.nextInt(7)+1;
    }
}
