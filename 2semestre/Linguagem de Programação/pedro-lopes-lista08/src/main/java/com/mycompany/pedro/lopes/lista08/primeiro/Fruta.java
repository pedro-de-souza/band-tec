/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista08.primeiro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Fruta {


    private List<String> listaFruta = new ArrayList<String>();

    public Fruta() {
        this.listaFruta.add("Abacaxi");
        this.listaFruta.add("Banana");
        this.listaFruta.add("Caju");
        this.listaFruta.add("Damasco");
        this.listaFruta.add("Fijo");
        this.listaFruta.add("Goiaba");
        this.listaFruta.add("Jaca");
        this.listaFruta.add("Kiwi");
        this.listaFruta.add("Laranja");
        this.listaFruta.add("Limão");
        this.listaFruta.add("Maçã");
        this.listaFruta.add("Melancia");
        this.listaFruta.add("Pera");
        this.listaFruta.add("Romã");
        this.listaFruta.add("Seriguela");
        this.listaFruta.add("Uva");
        this.listaFruta.add("Uva");
        this.listaFruta.add("Xixa");
        this.listaFruta.add("Zimbro");
    }
  
    public  Boolean testFruta(String usuarioDigito) {        
        return this.listaFruta.contains(usuarioDigito);
    }

}
