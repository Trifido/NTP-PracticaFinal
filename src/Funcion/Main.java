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
       FachadaFuncion f = new FachadaFuncion();
       
       f.addIncognita();
       f.addIncognita();
       
       //f.setFun(FachadaFuncion.Sum(new Incognita(21.5f), FachadaFuncion.Sum(FachadaFuncion.Mul(f.getIncognita(0), FachadaFuncion.Sin(FachadaFuncion.Mul(new Incognita((4.f * Math.PI)), f.getIncognita(1)))), args)));
       
       System.out.println(f.Resultado());
       
    }
    
}
