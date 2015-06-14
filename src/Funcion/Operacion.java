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

/**
 * Clase abstracta que contiene un objeto DecoradorOperación y además
 * es heredado por la clase DecoradorOperación, de esta forma se permite
 * construir funciones complejas usando el patrón Decorador.
 */
public abstract class Operacion {
    DecoradorOperacion X;
    
    Operacion(){
        X = null;
    }

    public Operacion(DecoradorOperacion X) {
        this.X = X;
    }
    
    public abstract Double Resultado();
    
    
}
