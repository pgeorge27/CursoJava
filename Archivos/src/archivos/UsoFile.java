/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;

/**
 *
 * @author 14V014
 */
public class UsoFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File directorio = new File("C://");
        File a = new File(directorio, "prueba.txt");
        
        System.out.println("nombre: " +a.getName());
        System.out.println("ruta: " + a.getPath());
        System.out.println("Directorio padre: " + a.getParent());
        System.out.println("Existe?: " +a.exists());
        System.out.println("Se puede leer?: " +a.canRead());
        System.out.println("Se puede escrbir?: " + a.canWrite());
        System.out.println("longitud: " + a.length());
        System.out.println("Es un directorio: " + a.isDirectory());
        System.out.println("es un archivo?: " + a.isFile());
        System.out.println("Modificado: " + a.lastModified());
        System.out.println("Borrado: " + a.delete());
    }
    
}
