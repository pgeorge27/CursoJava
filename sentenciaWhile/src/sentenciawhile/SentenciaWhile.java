/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciawhile;

/**
 *
 * @author 14V014
 */
public class SentenciaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        while(i<=10){
            if(i % 2 == 0)
                System.out.println("El numero " + i + " es par.");
            else{
                System.out.println("El numero " + i + " no es par.");
            }
            i++;
        }
    }
    
}
