/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista07.primeiro;

import java.text.NumberFormat;

/**
 *
 * @author pedro
 */
public class Empregado {
    private String nome = "";
    private String cargo = "";
    private Double salario = 0.0;
    private Double porcentagemReajuste = 0.0;
    

    public Empregado(String nome, String cargo, Double salario, Double porcentagemReajuste) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.porcentagemReajuste = porcentagemReajuste;
    }
    
    public void exibeEmpregado() {
        System.out.println("\nEmpregado");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Cargo: "+ this.cargo);        
    }
    public void reajustarSalario(){
        Double reajuste = this.salario+(this.salario * this.porcentagemReajuste);
        System.out.println("Salário Reajustado: "+ NumberFormat.getCurrencyInstance().format(reajuste));
    }

   
    
    
}
