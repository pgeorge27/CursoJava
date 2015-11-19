/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author 14V014
 */
public class AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rec_1;
        Rectangulo rec_2;
        
        //creacion de objetos
        rec_1 = new Rectangulo(10.1, 2.5);
        rec_2 = new Rectangulo(4.3, 3.9);
        
        System.out.println("Del objeto referenciado por rec_1: ");
        rec_1.MostrarBase();
        rec_1.MostrarAltura();
        System.out.println("El area es: " + rec_1.area());
        
        System.out.println("Del objeto referenciado por rec_2: ");
        rec_2.MostrarBase();
        rec_2.MostrarAltura();
        System.out.println("El area es: " + rec_2.area());
    }
    
}
