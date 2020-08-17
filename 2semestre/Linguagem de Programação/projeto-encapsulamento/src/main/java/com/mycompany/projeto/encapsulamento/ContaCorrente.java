/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.encapsulamento;

/**
 *
 * @author Aluno
 */
public class ContaCorrente {
    private Double saldo = 0.0;
    private Integer operacao = 0;

    public Double getSaldo() {
        return saldo;
    }
    public Integer getOperacao() {
        return operacao;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    void depositar50(){
        saldo+=50;
        operacao++;
    }
    void sacar50(){
        if(saldo >=50){
           saldo-=50; 
           operacao++;
        }
    }
    
    
}
