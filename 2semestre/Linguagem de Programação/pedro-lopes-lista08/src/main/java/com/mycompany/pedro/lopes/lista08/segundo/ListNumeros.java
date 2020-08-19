/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista08.segundo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author pedro
 */
public class ListNumeros {

    private List<Integer> listaInteger = new ArrayList<Integer>();

    public void addNumber(Integer numUserDigito) {
        this.listaInteger.add(numUserDigito);
    }

    public void parNuns() {
        System.out.println("\nTodos os numeros pares da listas: ");
        for (Integer i : this.listaInteger) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void imparNuns() {
        System.out.println("\nTodos os numeros ímpares da lista: ");
        for (Integer i : this.listaInteger) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void todosNuns() {
        System.out.println("\nTodos os numeros da lista: ");
        for (Integer i : this.listaInteger) {
            System.out.println(i);
        }
    }

    public void maiorNun() {
        System.out.println("\nO maior numero da lista: ");
        System.out.println(Collections.max(listaInteger));
        
//        Integer maior = this.listaInteger.get(0);
//        for (Integer i : this.listaInteger) {
//            if (i > maior) {
//                maior = i;
//            }
//        }
//        System.out.println(maior);

    }

    public void menorNun() {
        System.out.println("\nO mmenor numero da lista: ");
        System.out.println(Collections.min(listaInteger));

//        Integer menor = this.listaInteger.get(0);
//        for (Integer i : this.listaInteger) {
//            if (i < menor) {
//                menor = i;
//            }
//        }
//        System.out.println(menor);

    }
}
