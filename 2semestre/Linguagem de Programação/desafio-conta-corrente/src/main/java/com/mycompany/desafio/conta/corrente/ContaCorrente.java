/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.conta.corrente;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class ContaCorrente {
    private String titular;
    private Double saldo;
    private List<Historico> listHistorico = new ArrayList<Historico>();

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void deposito(Double valor, Integer dia, Integer mes, Integer ano){
        this.saldo+=valor;
        listHistorico.add(new Historico(dia, mes, ano, valor, "deposito"));
        System.out.println(listHistorico.get(listHistorico.size()-1));
    }
    public void sacar(Double valor, Integer dia, Integer mes, Integer ano){
        if(this.saldo - valor >= 0 ){
            this.saldo-=valor;
            listHistorico.add(new Historico(dia, mes, ano, valor, "sacar"));
            System.out.println(listHistorico.get(listHistorico.size()-1));
        }
        else{
            String[] primeiroNome = this.titular.split(" ");
            System.out.println(" Aviso: "+ primeiroNome[0] +" impossível fazer tal operação, seu saldo é insuficiente\n");
        }
    }
    public void exibirExtrato(){
        System.out.println("---------------------- Exibindo extrato da conta -----------------------");
        
        System.out.println(" Titular: "+ this.titular+
                            "\n Saldo: "+ NumberFormat.getCurrencyInstance().format(this.saldo)
        );
        
        Integer cont = 1;
        System.out.println("\n Histórico: \n");
        for (Object o : listHistorico) {
            System.out.println(" Nº................................................................... "+ cont++);
            System.out.println(o);
        }
    }
    
    
}
