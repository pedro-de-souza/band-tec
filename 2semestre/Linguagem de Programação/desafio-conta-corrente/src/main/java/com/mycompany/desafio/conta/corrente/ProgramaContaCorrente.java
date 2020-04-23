/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author pedro
 */
public class ProgramaContaCorrente {

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        
        
        System.out.println("-------------------------------- Conta 1 -------------------------------");
        ContaCorrente conta1 = new ContaCorrente("Pedro Lopes", 500.00);
        conta1.sacar(50.00, 4, 5, 2015);
        conta1.deposito(550.00, 5, 7, 2017);

        conta1.exibirExtrato();

        System.out.println("\n-------------------------------- Conta 2 -------------------------------");
        ContaCorrente conta2 = new ContaCorrente("Marco Dias", 1000.00);
        conta2.deposito(200.00, 23, 2, 2018);
        conta2.sacar(600.00, 5, 3, 2020);
        conta2.sacar(700.00, 15, 2, 2020);//não pode efetuar esse saque pois não tem dinheiro suficiente na conta
        conta2.exibirExtrato();
        
        
        System.out.println("\n-------------------------------- Conta 3 -------------------------------");
        ContaCorrente conta3 = new ContaCorrente("Giovana Meirelles", 2000.00);
        conta3.sacar(700.00, 8, 12, 2018);
        conta3.deposito(500.00, 17, 7, 2019);
        conta3.sacar(200.00, 24, 9, 2019);

        conta3.exibirExtrato();
        
        System.out.println("--------------------------------- Fim ----------------------------------\n");

    }
}
