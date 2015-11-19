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
public class HeredaOtroPaquete extends ControlAcceso {

    public HeredaOtroPaquete() {
        System.out.println("Constructor HeredaOtroPaquete");
        //Solo para clases del mismo paquete
        //System.out.println("n_def = " +n_def);
        //Solo para la clase que lo define
        //System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
    
}
