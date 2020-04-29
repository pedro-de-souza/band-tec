/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.pedro.souza.c2;

/**
 *
 * @author pedro
 */
public class Jogador {
    private String nome;
    private Integer idade;
    private String posicao;
    private Double valorDoPasse;

    public Jogador(String nome, Integer idade, String posicao, Double valorDoPasse) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.valorDoPasse = valorDoPasse;
    }

    public void exibeDados(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" Dados do jogador:");
        System.out.println(" Nome: "+nome);
        System.out.println(" Idade: "+idade);
        System.out.println(" Posição: "+posicao);
        System.out.println(String.format(" Valor do passe: %.2f", valorDoPasse));
        System.out.println("------------------------------------------------------------------------\n");
    }

    public String getNome() {
        return nome;
    }

    public Double getValorDoPasse() {
        return valorDoPasse;
    }
    public String toString() {
        return String.format(" Nome: %s \n" +
                             " Idade: %d \n" +
                             " Posição: %s\n" +
                             " Valor do passe:  %.2f\n",
                               nome,idade,posicao,valorDoPasse);
    }
}
