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
public class UsoFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            metA();
        } catch (Exception e) {
            System.out.println("Excepcion capturada");
        }
        metB();
        metC();
    }
    
    static void metA(){
        try {
            System.out.println("Dentro de metA");
            throw new RuntimeException("Prueba");
        } finally {
            System.out.println("Bloque finally metA");
        }
    }
    
    static void metB(){
        try {
            System.out.println("Dentro de metB");
        } finally {
            System.out.println("Bloque Finally metB");
        }
    }
    
    static void metC(){
        try{
            System.out.println("dentro de metC");
        }finally{
            System.out.println("bloque finally metC");
        }
}
    
}
