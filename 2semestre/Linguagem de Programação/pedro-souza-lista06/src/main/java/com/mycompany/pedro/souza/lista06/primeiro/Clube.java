/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.souza.lista06.primeiro;

/**
 *
 * @author pedro
 */
public class Clube {
    private Integer pontos = 0;
    private Integer vitoria = 0;
    private Integer empate = 0;
    private Integer derrota = 0;
    
    public void registrarVitoria(){
        vitoria+=1;
        pontos+=3;
        
    }
    public void registrarEmpate(){
        empate+=1;
        pontos+=1;
    }
    public void registrarDerrota(){
        derrota+=1;
    }
    
    
    
    public Integer getPonto() {    
        return this.pontos;
    }
    
    public Integer getVitoria() {    
        return this.vitoria;
    }
    
    public Integer getEempate() {    
        return this.empate;
    }
    public Integer getDerrota() {    
        return this.derrota;
    }
}
