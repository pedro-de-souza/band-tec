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
public class AlunoGraduacao extends Aluno{
    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoGraduacao( String nome, Integer ra,Double notaContinuada, Double notaIntegrada) {
        super(nome, ra);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }
    public void exibirAluno(){
        System.out.println("Aluno: "+nome);
    }
    
    
}
