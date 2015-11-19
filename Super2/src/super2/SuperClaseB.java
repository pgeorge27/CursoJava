/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super2;

/**
 *
 * @author 14V014
 */
public class SuperClaseB extends SuperClaseA{
    
    private int numero;
    
    public SuperClaseB(int numero, int numero2){
        this.numero = numero;
        super.numero = numero2;
    }
    public void mostrar(){
        super.Mostrar();
        System.out.println("En la subClaseB, numero es: " + numero);
    }
}
