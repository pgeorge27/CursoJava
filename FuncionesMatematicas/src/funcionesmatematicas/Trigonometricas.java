/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesmatematicas;

/**
 *
 * @author 14V014
 */
public class Trigonometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double angulo = Math.PI;
        
        double sen = Math.sin(angulo/2);
        double cos = Math.cos(angulo);
        double tan = Math.tan(angulo/3);
        
        System.out.println("EL seno de 90° es: " + sen);
        System.out.println("el coseno de 180° es: " + cos);
        System.out.println("la tangente de 60° es: " + tan);
        
        //Calculamos arcoseno
        double sen_grados = Math.asin(1);
        sen_grados = Math.toDegrees(sen_grados);
        double cos_grados = Math.acos(1);
        cos_grados = Math.toDegrees(cos_grados);
        double tan_grados = Math.atan(1);
        tan_grados = Math.toDegrees(tan_grados);
        System.out.println("El angulo cuyo seno es 1 es: " + sen_grados);
        System.out.println("El angulo cuyo coseno es 1 es: " + cos_grados);
        System.out.println("el angulo cuya tangente es 1 es: " + tan_grados);
    }
    
}
