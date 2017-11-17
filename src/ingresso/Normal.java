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
public class Normal extends Ingresso{
    private double valor_normal;
    
    public void ValorNormal(double valor_normal){
        this.valor_normal = valor_normal;
    }
    
    public double ImprimeValorNormal(){
        return valor_normal;
    }
}