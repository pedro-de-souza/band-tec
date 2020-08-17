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
public class Termometro {

    private Integer temperaturaAtual = 0;
    private Integer temperaturaMax = 0;
    private Integer temperaturaMin = 0;

    public Termometro(Integer temperaturaAtual, Integer temperaturaMax, Integer temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public void aumentaTemperatura(Integer valor) {
        System.out.println("\n-------------------------------");
        System.out.println("Aumentando");
        this.temperaturaAtual += valor;
        if (this.temperaturaAtual> this.temperaturaMax) {
            this.temperaturaAtual = this.temperaturaMax;
        }
    }

    public void diminuiTemperatura(Integer valor) { 
        System.out.println("\n--------------------------------");
        System.out.println("Diminuindo");
        this.temperaturaAtual -=valor;
        if (this.temperaturaAtual < this.temperaturaMin) {
            this.temperaturaAtual = this.temperaturaMin;
        } 
    }
    public void exibeCelsius(){
        System.out.println("\nTemperatura em Celsius: ");
        System.out.println("Atual: "+ this.temperaturaAtual+"ºC");
        System.out.println("Máxima: "+ this.temperaturaMax+"ºC");
        System.out.println("Ménima: "+ this.temperaturaMin+"ºC");
    }
    
    public void exibeFahrenheit() {
        System.out.println("\n--------------------------------");
        System.out.println("Temperatura em Fahreinheit: ");
        System.out.println(String.format("Atual: %.0f°F ", this.temperaturaAtual* 1.8 + 32 ));
        System.out.println(String.format("Máxima: %.0f°F ", this.temperaturaMax* 1.8 + 32 ));
        System.out.println(String.format("Ménima: %.0f°F ", this.temperaturaMin* 1.8 + 32 ));
 
    }
}
