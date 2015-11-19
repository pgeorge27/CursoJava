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
public class BusquedaCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Esta es la cadena original para la busqueda";
        String str = "la";
        char caracter = 'a';
        
        System.out.print("la primera aparicion de : 'a' es en la posicion: " );
        System.out.println(s.indexOf(caracter));
        
        System.out.print("la primera aparicion de : 'la' es en la posicion: ");
        System.out.println(s.indexOf(str));
        
        System.out.print("la ultima aparicion de: 'a' es en la posicion: ");
        System.out.println(s.lastIndexOf(caracter));
        
        System.out.print("la ultima aparicion de: 'la' es en la posicion");
        System.out.println(s.lastIndexOf(str));
    }
    
}
