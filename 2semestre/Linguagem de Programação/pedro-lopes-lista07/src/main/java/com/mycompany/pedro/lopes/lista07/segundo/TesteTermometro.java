/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista07.segundo;

/**
 *
 * @author pedro
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro(20,29,15);
        
        termometro.exibeCelsius();
        
        
        termometro.aumentaTemperatura(5);
        termometro.exibeCelsius();
        termometro.aumentaTemperatura(25);
        termometro.exibeCelsius();
        
        
        termometro.diminuiTemperatura(7);
        termometro.exibeCelsius();
        termometro.diminuiTemperatura(30);       
        termometro.exibeCelsius();
        
        
        termometro.exibeFahrenheit();
        
    }
}
