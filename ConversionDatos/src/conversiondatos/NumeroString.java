/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiondatos;

/**
 *
 * @author 14V014
 */
public class NumeroString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b = 1;
        short sh = 100;
        int i = 15000;
        long l = 14478965;
        float f = (float) 150.23;
        double d = 0.123456789;
        
        System.out.println("de byte a String: " +String.valueOf(b));
        System.out.println("de short a String: " + String.valueOf(sh));
        System.out.println("de int a String: " + String.valueOf(i));
        System.out.println("de long a String: " + String.valueOf(l));
        System.out.println("de float a String: " + String.valueOf(f));
        System.out.println("de double a String: " + String.valueOf(d));
    }
    
}
