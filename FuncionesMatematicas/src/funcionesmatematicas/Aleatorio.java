/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesmatematicas;

/**
 *
 * @author 14V014
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double aleatorio;
        aleatorio = Math.random();
        System.out.println("el numero aleatorio entre 0 y 1 es: " + aleatorio);
        aleatorio *= 10;
        System.out.println("el numero aleatorio entre 0 y 10 es: " + aleatorio);
        aleatorio = aleatorio + 5;
        System.out.println("el numero aleatorio entre 5 y 15 es: " + aleatorio);
        int numero = (int) aleatorio;
        System.out.println("el numero aleatorio entre 5 y 15 es: " + numero);
    }
    
}
