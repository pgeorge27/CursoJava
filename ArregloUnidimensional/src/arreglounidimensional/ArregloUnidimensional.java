/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglounidimensional;

/**
 *
 * @author 14V014
 */
public class ArregloUnidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numeros[] = {11.2, 10.6, 8.5, 15.9, 3.1, 20.12};
        double promedio = 0;
        for (int i = 0; i < 6; i++) {
            promedio = promedio + numeros[i];   
        }
        promedio /= 6;   
        System.out.println("El promedio es: " + promedio);
    }
    
}
