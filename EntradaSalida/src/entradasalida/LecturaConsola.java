/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalida;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author 14V014
 */
public class LecturaConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader buff = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String str;
        System.out.println("Intruzca las lineas de texto.");
        System.out.println("Escriba 'salir' para terminar el programa.");
        do {            
            try {
                str = buff.readLine();
            } catch (Exception e) {
                str = "";
            }
            System.out.println("Usted escribió: " + str);
        } while (!str.equalsIgnoreCase("salir"));
    }
    
}
