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
public class OtrosMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "    Esta es la cadena ORIGINAL      ";
        System.out.print("Se sustituye el caracter 'a' por 'o': ");
        System.out.println(s.replace('a', 'o'));
        
        System.out.print("Se eliminaran los espacios en blanco: ");
        System.out.println(s.trim());
        
        System.out.print("Se convierten los caracteres a minusculas: ");
        System.out.println(s.toLowerCase());
        
        System.out.print("Se convierten los caracteres a mayuscula");
        System.out.println(s.toUpperCase());
        
        System.out.print("Se convierten los caracteres a mayuscula y se eliminan los espacios en blanco");
        System.out.println(s.toUpperCase().trim());
    }
    
}
