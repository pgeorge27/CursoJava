/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 14V014
 */
public class UsoFileWriteBufferedWriter {

    /**
     * @param args the command line arguments
     */
    
    static FileWriter archivo = null;
    static BufferedWriter bw;
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Este sera el contenido del nuevo archivo.";
        String s2 = "Esto se copiará en la otra linea.";
        String ruta = "C:\\Users\\14V014\\Documents\\prueba2.txt";
        abrir(ruta);
        
        if (bw != null) {
            escribir(s1);
            escribir(s2);
            vaciarBuffer();
            cerrar();
        }
    }

    private static void abrir(String ruta) {
        try {
            archivo = new FileWriter(ruta);
            bw = new BufferedWriter(archivo);
        } catch (IOException e) {
            bw = null;
        }
    }

    private static void escribir(String s) {
        try {
            bw.write(s);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error de escritura en el archivo.");
        }
    }
    
    public static void vaciarBuffer(){
        try {
            bw.flush();
        } catch (IOException e) {
            System.out.println("Error vaciando el buffer");
        }
    }
    
    public static void cerrar(){
        try {
            archivo.close();
        } catch (IOException ex) {
            System.out.println("Error cerrando el archivo.");
        }
    }
    
}
