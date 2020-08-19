/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista08.terceiro;

/**
 *
 * @author pedro
 */
public class ProgramaAluno {
    public static void main(String[] args) {
        System.out.println("\n\n---------------------------- SITUAÇÃO DO AULO --------------------------");
        
        Aluno a1 = new Aluno("1502977", "Marco");
        a1.adicionar(new Disciplina("Banco de dados", 9.6, 8.5, 0));
        a1.adicionar(new Disciplina("Analise de Sistema", 8.6, 7.5, 1));
        a1.adicionar(new Disciplina("Desing e Desenvolvimento Web", 10.0, 10.0, 0));
        a1.exibirBoletim();
        
        System.out.println("\n");
    }
}
