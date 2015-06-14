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

/**
 * Clase que lleva la estrategia a utilizar para encontrar el máximo que se la 
 * otorga al buscador
 */
public class Algoritmo {
    private Estrategia estrategia;    
    
    public Algoritmo(Estrategia aux){
        estrategia= aux;
    }
    
    public void setEstrategia(Estrategia aux){
        estrategia= aux;
    }
    
    public Estrategia getEstrategia(){
        return estrategia;
    }
    
    public String getTipo(){
        return estrategia.getTipo();
    }
    
    public void addRange(Double min, Double max){
        estrategia.addRange(min, max);
    }
    
    /**
    * La funcion busca es la que delega la función a la estrategia para encontrar
    * el máximo mediante la llamada a la funcion opera.
    * @param fun
    * @return Máximo: double
    */
    public Double busca(Funcion fun){
        return estrategia.opera(fun);
    }
    
}
