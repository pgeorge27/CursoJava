/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 14V014
 */
public class PersonaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante(123456789, "Antonio Lopez", 15.9);
        System.out.println("La cedula del estudiante es: ");
        System.out.println(e.obtenerCedula());
        System.out.println("El nombre del estudiante es: ");
        System.out.println(e.obtenerNombre());
        System.out.println("El promedio del estudiante es: ");
        System.out.println(e.obtenerPromedio());
    }
    
}
