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
public class CompararFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar actual = Calendar.getInstance();
        Calendar modificado = Calendar.getInstance();
        modificado.set(2000, 11, 24);
        
        System.out.println("La fecha actual es posterior a la modificada?: ");
        System.out.println(actual.after(modificado));
        System.out.println("La fecha actual es anterior a la modificada?: ");
        System.out.println(actual.before(modificado));
        System.out.println("La fecha actual es igual a la modificada?: ");
        System.out.println(actual.equals(modificado));
    }
    
}
