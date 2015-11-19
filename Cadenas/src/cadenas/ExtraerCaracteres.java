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
public class ExtraerCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Esta es una cadena de prueba.";
        
        char c = s.charAt(3);
        System.out.println("CharAt: " + c);
        
        char cadena [] = new char[23];
        cadena [0] = 'h';
        cadena [1] = 'o';
        cadena [2] = 'l';
        cadena [3] = 'a';
        cadena [4] = ' ';
        
        s.getChars(0, 18, cadena, 5);
        System.out.print("getChars: ");
        System.out.println(cadena);
        
        int longitud = s.length();
        char cad [] = new char [longitud];
        cad = s.toCharArray();
        System.out.print("toCharArray: ");
        System.out.println(cad);
        
        String sub1 = s.substring(21);
        String sub2 = s.substring(8, 17);
        System.out.println("Substring: " + sub1);
        System.out.println(sub2);
    }
    
}
