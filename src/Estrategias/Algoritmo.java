/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategias;

import Funcion.Funcion;

/**
 *
 * @author Benjamín y Vicente 
 */
public class Algoritmo {
    private final Estrategia estrategia;
    
    public Algoritmo(Estrategia aux){
        estrategia= aux;
    }
    
    public Estrategia getEstrategia(){
        return estrategia;
    }

     public Double busca(Funcion fun){
         return estrategia.opera(fun);
     }
    
}
