/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author 14V014
 */
public class CreacionString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char c[] = {'a','b','c','d','e','f'};
        String vacia = new String();
        String s1 = new String(c);
        String s2 = new String(c,2,3);
        String s3 = new String(s1);
        
        String s4 = "Usando literal de cadena";
        
        System.out.println("La cadena vacia: " + vacia);
        System.out.println("La cadena s1: " + s1);
        System.out.println("La cadena s2: " + s2);
        System.out.println("La cadena s3: " + s3);
        System.out.println("La cadena s4: " + s4);
    }
    
}
