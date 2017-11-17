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
public class Teste {
    
    
    public static void main(String args[]) {
        Ingresso show1 = new Ingresso();
        show1.valor =166.50;
        
        Normal v1 = new Normal();
        v1.ValorNormal(show1.valor);
        
        Vip v2 = new Vip();
        v2.ValorVip(show1.valor);
        
        CamaroteInferior camarote = new CamaroteInferior();
        camarote.setlocalizacao("Camarote Inferior.");
        
        CamaroteSuperior v3 = new CamaroteSuperior();
        v3.CamaroteSuperior(show1.valor);
        
         System.out.println("Ingressos disponíveis para o show Hard Core no Bar HELL: \n"
        + "Ingresso Normal:"+ v1.ImprimeValorNormal() + "\n"
        + "Ingresso VIP:"+ v2.ImprimeValorVip() + "\n"
        + camarote.getlocalizacao() + "\n"
        + "Camarote Superior:" + v3.ImprimeValorCamarote());
    }
}