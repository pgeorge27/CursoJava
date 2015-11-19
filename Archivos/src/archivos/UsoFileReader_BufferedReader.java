/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 14V014
 */
public class UsoFileReader_BufferedReader {

    /**
     * @param args the command line arguments
     */
    
    static FileReader archivo;
    
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br;
        int caracter;
        String contenido = "";
        String ruta = "C:/prueba.txt";
        br= abrir(ruta);
        contenido = leer(br);
        while (contenido != null) {            
            System.out.println(contenido);
            contenido = leer(br);
        }
        cerrar();
    }

    private static BufferedReader abrir(String ruta) {
       BufferedReader br;
        try {
            archivo = new FileReader(ruta);
            br = new BufferedReader(archivo);
        } catch (FileNotFoundException e) {
            br = null;
        }
        return br;
    }

    private static String leer(BufferedReader br) {
        String contenido;
        try {
            contenido = br.readLine();
        } catch (IOException e) {
            System.out.println("Error en la lectura del buffer");
            contenido = null;
        }
        return contenido;
    }
    
    public static void cerrar(){
        try {
            archivo.close();
        } catch (IOException e) {
        }
    }
    
}
