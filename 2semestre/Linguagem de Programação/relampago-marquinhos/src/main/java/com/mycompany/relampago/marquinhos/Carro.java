/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relampago.marquinhos;

/**
 *
 * @author pedro
 */
public class Carro {

    private Double velocidade = 0.00;
    private Boolean status = false;
    private Integer combustivel = 0;
    private Integer cambio = 0;

    public Boolean statusCarro() {
        if (this.status == false && this.cambio == 0) {
            return this.status = true;
        } else if (this.status == true && this.cambio == 0) {
            return this.status = false;
        }
        return this.status;
    }

    public void acelerarCarro() {
        if (this.status == true && this.cambio > 0 && this.combustivel > 0) {

            if (this.velocidade >= 0 && this.velocidade < 320) {
                this.velocidade += 10.00;
                //if(this.cabio == 1){this.velocidade += 10.00;}
            }

        }
    }

    public void freiarCarro() {
        if (this.status == true && this.cambio > 0 && this.combustivel > 0) {
            if (this.velocidade > 0 && this.velocidade <= 320) {
                this.velocidade -= 10.00;
            }
        }
    }

    public void passandoMaisUmaMasha() {
        if (this.status == true) {
            if (this.cambio >= 0 && this.cambio < 5) {
                this.cambio += 1;
            }
        }
    }

    public void voltandoUmaMarcha() {
        if (this.status == true) {
            if (this.cambio > 0 && this.cambio <= 5) {
                this.cambio -= 1;
            }

        }
    }

    public void abastecerCarro() {
        this.combustivel += 15;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public Boolean getStatus() {
        return status;
    }

    public Integer getCombustivel() {
        return combustivel;
    }

    public Integer getCambio() {
        return cambio;
    }

}
