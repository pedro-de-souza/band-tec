/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.encapsulamento;

/**
 *
 * @author Aluno
 */
public class Cartao {
    public static void main(String[] args) {
        ContaCorrente corrente1 = new ContaCorrente();
        
        System.out.print("Depositando 50. ");
        corrente1.depositar50();
        System.out.println("\nSaldo atual: "+corrente1.getSaldo());
        System.out.print("Sacando 50. ");
        corrente1.sacar50();
        corrente1.setSaldo(5.0);
        System.out.println("\nSaldo atual: "+corrente1.getSaldo());
        
    }
}
