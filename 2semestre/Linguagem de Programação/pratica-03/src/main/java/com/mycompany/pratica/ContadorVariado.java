/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pratica;

/**
 *
 * @author pedro.souza
 */
public class ContadorVariado {
    public static void main(String[] args) {
        for(Double n = 0.15 ; n <5; n+=n){
            System.out.println(String.format("%.2f", n));
        }
    }
}
