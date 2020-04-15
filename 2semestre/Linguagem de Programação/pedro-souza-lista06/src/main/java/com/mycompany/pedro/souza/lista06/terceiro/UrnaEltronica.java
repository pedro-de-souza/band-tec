/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedro.souza.lista06.terceiro;

/**
 *
 * @author pedro
 */
public class UrnaEltronica {

    private Integer totalCandidato1 = 0;
    private Integer totalCandidato2 = 0;
    private Integer totalVotos = 0;
    private Boolean statusEleicao = true;

    public void votarCandidato1() {
        if (statusEleicao) {
            totalCandidato1 += 1;
            totalVotos += 1;
        }
    }

    public void votarCandidato2() {
        if (statusEleicao) {
            totalCandidato2 += 1;
            totalVotos += 1;
        }
    }
    
    public Integer getTotalCandidato1() {
        return totalCandidato1;
    }

    public Integer getTotalCandidato2() {
        return totalCandidato2;
    }

    public Integer getTotalVotos() {
        return totalVotos;
    }

    public Boolean getStatusEleicao() {
        return statusEleicao;
    }

    public void setStatusEleicao(Boolean statusEleicao) {
        this.statusEleicao = statusEleicao;
    }
    

}
