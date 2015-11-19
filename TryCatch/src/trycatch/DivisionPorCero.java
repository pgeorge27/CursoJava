/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author 14V014
 */
public class DivisionPorCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodo();
    }
    
    static void metodo(){
        int denom = 0;
        int num = 15;
        
        try {
            int r = num / denom;
            System.out.println("Estos no se imprimen.");
        } catch (ArithmeticException e) {
            System.out.println("Division por cero");
        }
        System.out.println("Despues de la sentencia catch");
    }
    
}
