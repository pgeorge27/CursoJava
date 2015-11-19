/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porReferencia;

/**
 *
 * @author 14V014
 */
public class PasePorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Objeto obj = new Objeto(2);
        PruebaPorReferencia P = new PruebaPorReferencia();
        System.out.println("Antes de la llamada es: " + obj.a);
        P.cambio(obj);
        System.out.println("Despues de la llamada es: " + obj.a);
    }
    
}
