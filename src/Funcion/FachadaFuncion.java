/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funcion;

import java.util.ArrayList;

/**
 *
 * @author Benjamín
 */
public class FachadaFuncion {
    ArrayList<Incognita> incognitas;
    Funcion fun;

    public FachadaFuncion() {
    }
    
    void addIncognita(){
        incognitas.add(new Incognita());
    }
    
    Incognita getIncognita(int indice){
        return incognitas.get(indice);
    }

    public Funcion getFun() {
        return fun;
    }

    public void setFun(Funcion fun) {
        this.fun = fun;
    }
    
    Float Resultado (){
        return fun.Resultado();
    }
    
    public static Operacion Sum(Operacion primera, Operacion segunda){
        return new Suma(primera, segunda);
    } 
    
    public static Operacion Res(Operacion primera, Operacion segunda){
        return new Resta(primera, segunda);
    }
    
    public static Operacion Mul(Operacion primera, Operacion segunda){
        return new Producto(primera, segunda);
    }
    
    public static Operacion Div(Operacion primera, Operacion segunda){
        return new Producto(primera, segunda);
    }
    
    
    public static Operacion Sin(Operacion operacion){
        return new Seno(operacion);
    }
    
    public static Operacion Cos(Operacion operacion){
        return new Coseno(operacion);
    }
    
}
