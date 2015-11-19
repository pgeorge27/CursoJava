/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.Calendar;

/**
 *
 * @author 14V014
 */
public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String meses [] = {"Enero", "Febrero", "Marzo", "Abril", 
            "Mayo", "Junio", "Julio", "Agosto", "Septiembre", 
            "Octubre", "Noviembre", "Diciembre"};
        
        Calendar actual = Calendar.getInstance();
        
        System.out.print("La fecha del sistema es: " + actual.get(Calendar.DATE));
        System.out.print(" " + actual.get(Calendar.MONTH));
        System.out.println(" " + actual.get(Calendar.YEAR));
        
        System.out.print("La hora del sistema es: ");
        System.out.print(actual.get(Calendar.HOUR));
        System.out.print(":" + actual.get(Calendar.MINUTE));
        System.out.println(":" + actual.get(Calendar.SECOND));
    }
    
}
