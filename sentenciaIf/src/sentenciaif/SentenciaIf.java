/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaif;

/**
 *
 * @author 14V014
 */
public class SentenciaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 2;
        if(i % 2 == 0)
            System.out.println("el numero: " + i + " es par.");
        else{
            System.out.println("el numero: " + i + " no es par.");
            if( i % 3 == 0)
                System.out.println("el numero es multiplo de 3");
        }
    }
    
}
