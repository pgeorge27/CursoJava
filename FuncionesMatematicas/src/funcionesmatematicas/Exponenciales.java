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
public class Exponenciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double exponencial = Math.exp(1);
        double logaritmo_m = Math.log(Math.E);
        double logaritmo  = Math.log10(100);
        double potencia = Math.pow(2, 8);
        double raiz = Math.sqrt(64);
        System.out.println("e Elevado a la 1 es: " + exponencial);
        System.out.println("el logarito natural de e es: " + logaritmo_m);
        System.out.println("el logaritmo en base 10 de 100 es: " + logaritmo);
        System.out.println("2 elevado a la 8 es: " + potencia);
        System.out.println("la raiz cuadrada de 64 es: " + raiz);
    }
    
}
