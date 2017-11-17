/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresso;

/**
 *
 * @author July_Edy
 */
public class CamaroteSuperior extends Vip{
    
    private double taxa;

    public void CamaroteSuperior(double valor) {
        this.taxa = (valor*4);
    }

    public double ImprimeValorCamarote(){
        return taxa;
    }

    
}
