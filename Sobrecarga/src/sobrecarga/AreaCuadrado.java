/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author 14V014
 */
public class AreaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cua_1 = new Cuadrado();
        Cuadrado cua_2 = new Cuadrado(2);
        System.out.println("El area del objeto referenciado por cua_1 es: ");
        System.out.println(cua_1.area());
        System.out.println("El area del objeto referenciado por cua_2 es: " + cua_2.area());
    }
    
}
