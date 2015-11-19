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
public class CompararCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "buenos dias";
        String s2 = "Buenos Dias";
        
        System.out.println("s1 y s2 son iguales (equals)?: ");
        System.out.println(s1.equals(s2));
        
        System.out.println("s1 y s2 son iguales (equalsIgnoreCase)?: ");
        System.out.println(s1.equalsIgnoreCase(s2));
        
        System.out.println("s1 y s2 son iguales (compareTo)?: ");
        System.out.println(s1.compareTo(s2));
        
        System.out.println("s1 y s2 son iguales (compareToIgnoreCase)?: ");
        System.out.println(s1.compareToIgnoreCase(s2));
        
        char b = 'b';
        char B = 'B';
        
        System.out.println("************NOTA***************");
        System.out.println("el valor de b es: " + (int)b);
        System.out.println("el valor de B es: " + (int)B);
    }
    
}
