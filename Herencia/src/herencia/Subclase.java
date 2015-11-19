/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author 14V014
 */
public class Subclase extends Superclase {
    int d;
    public Subclase(int x, int y, int z){
        a = x;
        b = y;
        d = z;
    }
    public void mostrar(){
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de d es: " + d);
    }
}
