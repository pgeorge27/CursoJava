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
public class Redondeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero = -15.49;
        double absoluto = Math.abs(numero);
        System.out.println("el valor absoluto de -15.49 es: " + absoluto);
        System.out.print("el menor numero entero mayor a 15.49 es: ");
        System.out.println(Math.ceil(absoluto));
        System.out.print("el mayor numero entero menor a 15.49 es: ");
        System.out.println(Math.floor(absoluto));
        System.out.print("el entero mas cercano en valor a 15.49 es: ");
        System.out.println(Math.rint(absoluto));
        System.out.print("el valor redondeado de 15.49 es: ");
        System.out.println(Math.round(absoluto));
    }
    
}
