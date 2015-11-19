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
public class Cuadrado {
    
    double lado;
    
    Cuadrado(){
        lado = 10;
    }
    
    Cuadrado(double lado){
        this.lado = lado;
    }
    
    double area(){
        return (lado*lado);
    }
    
}
