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
public class ModificarFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String meses [] = {"Enero", "Febrero", "Marzo", "Abril", 
            "Mayo", "Junio", "Julio", "Agosto", "Septiembre", 
            "Octubre", "Noviembre", "Diciembre"};
        String Am_Pm [] = {"AM","PM"};
        
        Calendar actual = Calendar.getInstance();
        actual.set(Calendar.HOUR, 14);
        
        System.out.print("la hora es: " + actual.get(Calendar.HOUR));
        System.out.println(" " + Am_Pm[ actual.get(Calendar.AM_PM)]);
        
        actual.set(2015, 10, 24);
        System.out.print("La fecha establecida es: ");
        System.out.print(actual.get(Calendar.DATE));
        System.out.print(" " + meses [actual.get(Calendar.MONTH)]);
        System.out.println(" " + actual.get (Calendar.YEAR));
    }
    
}
