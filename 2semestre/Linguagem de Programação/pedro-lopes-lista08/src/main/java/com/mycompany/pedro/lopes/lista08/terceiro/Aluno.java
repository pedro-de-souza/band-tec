/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista08.terceiro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Aluno {

    private String ra;
    private String nome;
    private List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
    

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }


    public void adicionar(Disciplina d) {
        this.listaDisciplina.add(d);
    }
    
    
    public void exibirBoletim() {
        System.out.println("\n Nome: "+ this.nome);
        System.out.print(" RA: "+ this.ra+"\n");
        
        for (Object o : listaDisciplina) {
            System.out.println(o);
        }
    }

}
