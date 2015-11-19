/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoespecificadores;

/**
 *
 * @author 14V014
 */
public class UsoEspecificadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaEspecificadores PruebaE = new PruebaEspecificadores();
        PruebaE.x = 10;
        PruebaE.y = 15;
        PruebaE.setz(20);
        System.out.println("El valor de x es: " + PruebaE.x);
        System.out.println("El valor de y es: " + PruebaE.y);
        System.out.println("El valor de z es: " + PruebaE.getz());
    }
    
}
