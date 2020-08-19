/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.lopes.lista08.terceiro;

/**
 *
 * @author pedro
 */
public class Disciplina {
    private String nome;
    private Double notaContinuada;
    private Double notaSemestral;
    private Integer quantFalta;
    private Boolean aprovado;
    private Double media;

    public Disciplina(String nome, Double notaContinuada, Double notaSemestral, Integer quantFalta) {
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
        this.quantFalta = quantFalta;
        calcularMedia();
    }
    
    public void calcularMedia(){
        this.media = (this.notaContinuada * 0.4) + (this.notaSemestral * 0.6);
        promovido();
    }
    private void promovido() {        
        this.aprovado = this.media >= 6 && this.quantFalta<=15;
    }



    @Override
    public String toString() {
//        return "Disciplina{" + "nome=" + nome + ", notaContinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + ", quantFalta=" + quantFalta + ", aprovado=" + aprovado + ", media=" + media + '}';
    return String.format("\n Nome da disciplina: %s"
                            +"\n Nota continuada: %.2f"
                            +"\n Nota integrada: %.2f"
                            +"\n Quantidade de faltas: %d"
                            +"\n Média final: %.2f"
                            +"\n Situação: %s", 
                            nome,notaContinuada,notaSemestral,quantFalta,media, (aprovado? "Aprovado!":"Reprovado!"));
    }
    
    
}
