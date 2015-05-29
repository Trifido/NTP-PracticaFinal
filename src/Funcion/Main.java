/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funcion;

/**
 *
 * @author Benjamín y Vicente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Funcion sum = new Funcion(2,3);
       
       Funcion f = new Funcion();
       Incognita x1 = f.addIncognita();
       Incognita x2 = f.addIncognita();
       
       f.Set(Operaciones.Sum(21.50, Operaciones.Mul(x1, Operaciones.Sin(Operaciones.Mul(4* Math.PI, x1)))));
       
       f.Set(Operaciones.Sum(f.Get(), Operaciones.Mul(x2, Operaciones.Sin(Operaciones.Mul(20* Math.PI, x2)))));
       
       
       x1.setValor(0.65);
       x2.setValor(1.0);
       
       Operaciones.StrToFun("sin(5)");
       
       //System.out.println(f.Resultado());
       //System.out.println((21.5+8.0*Math.sin(4*Math.PI*8.0)+0*Math.sin(20*Math.PI*0)));
       //f.setFun(Operaciones.Sum(new Incognita(21.5), Operaciones.Sum(Operaciones.Mul(f.getIncognita(0), Operaciones.Sin(Operaciones.Mul(new Incognita((4.f * Math.PI)), f.getIncognita(1)))), args)));

       System.out.println(f + " = " + f.Resultado());
       
    }
    
}
