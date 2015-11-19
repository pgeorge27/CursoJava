/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

/**
 *
 * @author 14V014
 */
public class FiguraTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo T = new Triangulo(4.3, 5.0);
        Figura F;
        F=T;
        System.out.println("El area del triangulo es: " + F.area());
    }
    
}
