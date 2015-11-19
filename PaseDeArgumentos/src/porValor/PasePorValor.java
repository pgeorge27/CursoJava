/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porValor;

/**
 *
 * @author 14V014
 */
public class PasePorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaPorValor P = new PruebaPorValor();
        int a = 2;
        System.out.println("El valor de a antes de la llamada es: " + a);
        P.cambio(a);
        System.out.println("El valor de a despues de la llamada es: " + a);
    }
    
}
