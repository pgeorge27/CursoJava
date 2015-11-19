/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodestatic;

/**
 *
 * @author 14V014
 */
class PruebaStatic {
    private static int x = 3;
    private static int y;

    public PruebaStatic() {
        System.out.println("Llamada al constructor");
    }
    
    public static void getX(){
        System.out.println("El valor de x es: " + x);
        getY();
    }
    
    private static void getY() {
        System.out.println("El valor de y es: " + y);
    }
    
    static{
        System.out.println("Se ejecuta el bloque static");
        y = x * 3;
    }
}
    
