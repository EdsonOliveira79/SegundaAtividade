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
public class Vip extends Ingresso {
    
    private double valor_vip;
    
    public void ValorVip(double valor){
        this.valor_vip = (valor*2);
    }
    
    public double ImprimeValorVip(){
        return valor_vip;
    }
}