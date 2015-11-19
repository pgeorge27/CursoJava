/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author 14V014
 */
public class Heredada extends ControlAcceso{

    public Heredada() {
        System.out.println("Constructtor Heredada");
        System.out.println("n_def = " + n_def);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
        //No se tiene acceso a n_pri
        //System.out.println("n_pri = " + n_pri);
    }
    
    
    
}
