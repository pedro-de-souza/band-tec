/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista07.primeiro;

/**
 *
 * @author pedro
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João","Analista de Sistemas",5400.00, 0.15);
        empregado1.exibeEmpregado();
        empregado1.reajustarSalario();
       
        
        Empregado empregado2 = new Empregado("Pedro Lopes","Analista e Desenvolvedor de Sistemas",5500.00, 0.10);
        empregado2.exibeEmpregado();
        empregado2.reajustarSalario();
    }
}
