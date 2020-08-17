/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possante_como_um_jato_veloz_como_um_foguete;

/**
 *
 * @author Aluno
 */
public class RelampagoMarquinhos {
    private Double aVelocidade = 0d;

    public Double getaVelocidade() {
        return aVelocidade;
    }
    private Boolean situacaoCarro;
    
    public Boolean ligarCarro(){
        return situacaoCarro = true;
    }
    public Boolean desligarCarro(){
        return situacaoCarro = false;
    }
    public void acelerarCarro(){
        if(situacaoCarro){
            aVelocidade +=10.00;
        }
    }
    public void frearCarro(){
        if(situacaoCarro){
            aVelocidade -=10.00;
        }
    }
}
