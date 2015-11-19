/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaswitch;

/**
 *
 * @author 14V014
 */
public class SentenciaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 2;
        
        switch(i){
            case 1: System.out.println("i tiene valor 1.");
                break;
            case 2: System.out.println("i tiene valor 2.");
                break;
            case 3: System.out.println("Falto break");
                break;
            default : System.out.println("i no tiene valor 1, 2 o 3");
        }
    }
    
}
