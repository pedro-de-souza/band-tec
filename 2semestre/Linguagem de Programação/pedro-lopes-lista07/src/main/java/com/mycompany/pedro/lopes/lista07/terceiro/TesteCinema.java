/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista07.terceiro;

/**
 *
 * @author pedro
 */
public class TesteCinema {
    public static void main(String[] args) {
        EntradaDeCinema cinema1 = new EntradaDeCinema(19, 5, 30, "Shrek");//Hora - sala - valor - nome
        EntradaDeCinema cinema2 = new EntradaDeCinema(15, 3, 35, "Jojo Rabbit");//Hora - sala - valor - nome
        
        cinema1.calculaDescontoHorario();
        cinema1.calculaDesconto(15,true);
        cinema1.exibirDados();
        
        cinema1.calculaDescontoHorario();
        cinema1.calculaDesconto(20,true);
        cinema1.exibirDados();
        
        cinema1.calculaDescontoHorario();
        cinema1.calculaDesconto(14,false);
        cinema1.exibirDados();
        
        cinema2.calculaDescontoHorario();
        cinema2.calculaDesconto(19,false);
        cinema2.exibirDados();
        
        cinema2.calculaDescontoHorario();
        cinema2.calculaDesconto(20,true);
        cinema2.exibirDados();
        
        cinema2.calculaDescontoHorario();
        cinema2.calculaDesconto(12,false);
        cinema2.exibirDados();
        
        System.out.println("Fim da execução");
            
        
    }
}
