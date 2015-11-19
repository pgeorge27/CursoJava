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
public class UsoThrow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            metodo();
        } catch (Exception e) {
            System.out.println("Recapturada en main");
        }
        
    }
    
    static void metodo(){
        try {
            throw new NullPointerException("Prueba");
        } catch (Exception e) {
            System.out.println("Capturada en metodo");
            throw e;
        }
    }
    
}
