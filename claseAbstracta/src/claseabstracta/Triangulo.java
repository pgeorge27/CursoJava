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
public class Triangulo extends Figura{
    public Triangulo(double a, double b){
        super(a,b);
    }
    
    public double area(){
        return (dim1 * dim2 / 2);
    }
}
