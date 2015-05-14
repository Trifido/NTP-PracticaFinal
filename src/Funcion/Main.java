/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funcion;

/**
 *
 * @author Benjamín
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Funcion sum = new Funcion(2,3);
       Incognita x = new Incognita();
       Incognita y = new Incognita();
       
       Funcion f = new Funcion(x);
       
       x.setValor(5.f);
       
       System.out.println(f.Resultado());
       
       x.setValor(12.f);
       
       System.out.println(f.Resultado());
       
       f = new Funcion(new Suma(x, y));
       
       x.setValor(12.f);
       y.setValor(5.f);
       
       System.out.println(f.Resultado());
       
    }
    
}
