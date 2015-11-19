/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiondatos2;

/**
 *
 * @author 14V014
 */
public class StringNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sByte = "10";
        String sShort = "105";
        String sInt = "10879";
        String sLong = "45372936";
        String sFloat = "15.43";
        String sDouble = "1.22635265172531";
        
        System.out.println("de String a byte: " + Byte.parseByte(sByte));
        System.out.println("de String a short: " + Short.parseShort(sShort));
        System.out.println("de String a int: " + Integer.parseInt(sInt));
        System.out.println("de String a long: " + Long.parseLong(sLong));
        System.out.println("de String a float: " + Float.parseFloat(sFloat));
        System.out.println("de String a Double: " + Double.parseDouble(sDouble));
    }
    
}
