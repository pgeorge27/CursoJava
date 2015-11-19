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
abstract class Figura {
    double dim1;
    double dim2;
    
    Figura(double x, double y){
        dim1 = x;
        dim2 = y;
    }
    abstract double area();
}
