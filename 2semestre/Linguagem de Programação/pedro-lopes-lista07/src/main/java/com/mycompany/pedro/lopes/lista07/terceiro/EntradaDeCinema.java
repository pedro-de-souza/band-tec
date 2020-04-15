/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista07.terceiro;

import java.text.NumberFormat;

/**
 *
 * @author pedro
 */
public class EntradaDeCinema {

    private Integer hora = 0;
    private Integer sala = 0;
    private Integer valor = 0;
    private String nome = "";
    private Double valorIngresso = 0.0;

    public EntradaDeCinema(Integer hora, Integer sala, Integer valor, String nome) {
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.nome = nome;
    }

    public void calculaDesconto(Integer idadeCliente, Boolean estudante){
        
        Double desconto = 0.0;
        if(idadeCliente <= 12){
            desconto = this.valor * 0.50;
            System.out.println("Desconto 12 anos");
        }else if(estudante){
            System.out.println("Desconto estudante");
            if (idadeCliente <= 15) {
                desconto =this.valor * 0.40;
            } else if (idadeCliente <= 20) {
                desconto =this.valor * 0.30;
            } else if (idadeCliente > 20) {
                desconto = this.valor * 0.20;
            }
        } 
        this.valorIngresso = this.valor - desconto; 
       
    }
    
    public void calculaDescontoHorario(){
        Double desconto = 0.0;
        if(this.hora < 16){
            System.out.println("Desconto do horário");
            desconto =  this.valor * 0.10;
        }
        this.valorIngresso = this.valor - desconto;
       
        
    }
    
    public void exibirDados(){
        
        System.out.println("\nFilme: " + this.nome);
        System.out.println("Horário: " + this.hora+"hr");
        System.out.println("Sala: " + this.sala);
        System.out.println("Valor: "+ NumberFormat.getCurrencyInstance().format(this.valorIngresso));
        System.out.println("------------------------------------------------------------------------");
    }
    
}
