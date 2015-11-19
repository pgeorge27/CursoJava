/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 14V014
 */
public class UsoThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            metodo();
        } catch (IllegalAccessException ex) {
            System.out.println("Capturada la excepcion");
        }
    }
    static void metodo() throws IllegalAccessException{
        System.out.println("Dentro del metodo");
        throw new IllegalAccessException("Prueba");
    }
    
}
