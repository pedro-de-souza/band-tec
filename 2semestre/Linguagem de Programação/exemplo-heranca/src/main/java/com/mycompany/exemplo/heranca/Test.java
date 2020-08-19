/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.heranca;

/**
 *
 * @author pedro
 */
public class Test {
    public static void main(String[] args) {
        AlunoGraduacao a1 = new AlunoGraduacao("Pablo",1000, 7.0,8.0);
        
        System.out.println("Aluno: "+a1.getNome());
    }
}
