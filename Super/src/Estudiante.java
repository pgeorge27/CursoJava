/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 14V014
 */
public class Estudiante extends Persona {
    private double promedio;
    public Estudiante(int c, String n, double prom) {
        super(c, n);
        promedio = prom;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
}
