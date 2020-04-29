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
public class ProgramaClube {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pedro",18,"Zagueiro",1000.00);
        Jogador j2 = new Jogador("Marco",22,"Lateral",2500.00);
        Jogador j3 = new Jogador("Naruto",18,"Atacante",2000.00);
        Clube c1 = new Clube("BandTec",3500.50);

        Clube c2 = new Clube("Updown",1000.00);
        Clube c3 = new Clube("Konoha",1500.00);

        j1.exibeDados();

        System.out.println("------------------------- Primeiro teste clube -------------------------\n");
        c1.exibeCaixa();

        c1.contratarJogador(j1);
        c1.contratarJogador(j2);

        c1.exibeJogadores();
        c1.exibeCaixa();
        System.out.println("-------------------------- Segundo teste clube -------------------------\n");

        c2.exibeJogadores();
        c2.exibeCaixa();

        System.out.println("-------------------------- Teceiro teste clube -------------------------\n");

        c3.contratarJogador(j3);
        c3.exibeJogadores();
        c3.exibeCaixa();

        j3.exibeDados();
        System.out.println("------------------------------------------------------------------------\n");

    }
}
