/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author mateus.bazzei
 */
public class motor {
    private int potencia;
    
    
    
    public motor(){
        potencia = 1000;
    }
    
    public motor (int potencia){
        this.potencia=potencia;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
