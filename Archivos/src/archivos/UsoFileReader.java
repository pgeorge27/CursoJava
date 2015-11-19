/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 14V014
 */
public class UsoFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileReader archivo = null;
        int caracter;
        String contenido = "";
        try {
            archivo = new FileReader("C:/prueba.txt");
        } catch (FileNotFoundException e) {
        }
        caracter = leer(archivo);
        while (caracter!=-1) {
            contenido = contenido + (char)caracter;
            caracter = leer(archivo);
        }
        System.out.println("El contenido del archivo es: ");
        System.out.println(contenido);
        try {
            archivo.close();
        } catch (IOException e) {
        }
    }

    private static int leer(FileReader archivo) {
        int c;
        try {
            c = archivo.read();
        } catch (IOException e) {
            e.printStackTrace();
            c = -1;
        }
        return c;
    }
    
}
