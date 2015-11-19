/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author 14V014
 */
public class Rectangulo {
    
    double base;
    double altura;
    
    Rectangulo(double x, double y){
        base = x;
        altura = y;
    }
    double area(){
        double resultado;
        resultado = base * altura;
        return(resultado);
    }
    
    void MostrarBase(){
        System.out.println("La base es: " + base);
    }
    
    void MostrarAltura(){
        System.out.println("La altura es: " + altura);
    }
    
}
