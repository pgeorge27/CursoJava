/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglomultidimensional;

/**
 *
 * @author 14V014
 */
public class ArregloMultidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros [][] = new int [3][3];
        numeros [0][0] = 5; numeros [0][1] = 8;  numeros [0][2] = 2;
        numeros [1][0] = 1; numeros [1][1] = 20; numeros [1][2] = 5;
        numeros [2][0] = 1; numeros [2][1] = 9;  numeros [2][2] = 11;
        
        int mayor = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(numeros[i][j] > mayor)
                    mayor = numeros[i][j];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
    
}
