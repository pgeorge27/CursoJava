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
public class ControlAcceso {
    int n_def = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;
    
    public ControlAcceso()
    {
        System.out.println("Constructor ControlAcceso");
        System.out.println("n_def = " + n_def);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }    
}
