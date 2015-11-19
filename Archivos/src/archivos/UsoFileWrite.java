/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.*;

/**
 *
 * @author 14V014
 */
public class UsoFileWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileWriter archivo = null;
        String s1 = "Este sera el contenido del archivo";
        char cadena [] = new char [s1.length()];
        s1.getChars(0, s1.length(), cadena, 0);
        try {
            archivo = new FileWriter("C:\\Users\\14V014\\Documents\\prueba.txt");
            archivo.write(s1);
            archivo.close();
            archivo = new FileWriter("C:\\Users\\14V014\\Documents\\prueba.txt", true);
            archivo.write(" Esto se añade al final.");
            archivo.write(cadena);
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
