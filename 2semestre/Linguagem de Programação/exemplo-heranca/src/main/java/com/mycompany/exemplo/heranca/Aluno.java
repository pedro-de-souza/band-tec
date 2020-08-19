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
public class Aluno {
    protected String nome;
    private Integer ra;

    public Aluno() {
    }
    
    public Aluno(String nome, Integer ra) {
        this.nome = nome;
        this.ra = ra;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    
    
    
    
}
