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
public class MismoPaquete {

    public MismoPaquete() {
        ControlAcceso C = new ControlAcceso();
        System.out.println("Contructor MismoPaquete");
        System.out.println("n_def = " + C.n_def);
        System.out.println("n_pro = " + C.n_pro);
        System.out.println("n_pub = " + C.n_pub);
        //System.out.println("n_pri = " + C.n_pri);
    }
    
}
