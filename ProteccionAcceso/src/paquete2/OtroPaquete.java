/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.ControlAcceso;

/**
 *
 * @author 14V014
 */
public class OtroPaquete {

    public OtroPaquete() {
        ControlAcceso C = new ControlAcceso();
        System.out.println("Constructor de OtroPaquete");
        System.out.println("n_pub = " + C.n_pub);
        //Solo para clases del mismo paquete
        //System.out.println("n_def = " + C.n_def);
        //Solo para clase que lo define
        //System.out.println("n_pri = " + C.n_pri);
        //solo para la clase que lo define
        //System.out.println("n_pro = " + C.n_pro);
    }
    
    
    
}
