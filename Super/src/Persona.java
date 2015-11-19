/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 14V014
 */
public class Persona {
    private int cedula;
    private String nombre;
    
    public Persona(int c, String n){
        cedula = c;
        nombre = n;
    }
    
    public int obtenerCedula(){
        return cedula;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
}
