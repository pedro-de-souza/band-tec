/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.pedro.souza.c2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Clube {
    private String nome;
    private Double caixa;
    private List<Jogador> listaDeJogadores = new ArrayList<Jogador>();

    public Clube(String nome, Double caixa) {
        this.nome = nome;
        this.caixa = caixa;
    }

    public void contratarJogador(Jogador jogador){
        if(jogador.getValorDoPasse()< caixa){
            listaDeJogadores.add(jogador);
            caixa -= jogador.getValorDoPasse();
        }
        else{
            System.out.println(" Fundos insuficientes para contratar o jogador " + jogador.getNome());
        }
    }

    public void exibeJogadores(){
        if(listaDeJogadores.isEmpty()){

            System.out.println("\n Você não contratou nenhum jogador ainda.");

        }else{
            Integer cont = 1;
            System.out.println("\n Lista de jogadores do Clube " +nome);
            for (Object o : listaDeJogadores) {
                System.out.println(" Contrato............................................................. "+ cont++);
                //System.out.println(" Nº................................................................... "+ cont++);
                System.out.println(o);
            }
        }
    }

    public void exibeCaixa(){
        System.out.println(String.format("\n Saldo disponível: %.2f\n", this.caixa));
    }
}
