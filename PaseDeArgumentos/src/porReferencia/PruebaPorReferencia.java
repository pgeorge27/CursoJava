/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porReferencia;

/**
 *
 * @author 14V014
 */
public class PruebaPorReferencia {
    void cambio(Objeto obj){
        obj.a = 15;
        System.out.println("El valor de a en el metodo es: " + obj.a);
    }
}
