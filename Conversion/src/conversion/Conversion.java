/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author 14V014
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b;
        int i = 258;
        double d = 330.289;
        System.out.println("Conversion de int a byte.");
        b = (byte) i;
        System.out.println("i = " + i + " b = " + b);
        System.out.println("Conversion de double a int.");
        i = (int) d;
        System.out.println("d = " + d + " i = " + i);
        System.out.println("Conversion de double a byte.");
        b = (byte) d;
        System.out.println("d = " + d + " b = " + b);
    }
    
}
