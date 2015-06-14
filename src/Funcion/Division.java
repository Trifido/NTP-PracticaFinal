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
 * Clase Division que representa esta operación, en caso de que el dividendo
 * sea 0 devolvemos infinito.
 */
public class Division extends DecoradorOperacion {
    Operacion Y;

    public Division(Operacion X, Operacion Y) {
        super(X);
        this.Y = Y;
    }  
    
    @Override
    public Double Resultado() {
        Double dividendo = Y.Resultado();
        
        if(dividendo == 0)
            return X.Resultado() * Double.POSITIVE_INFINITY;
        
        return X.Resultado() / dividendo;
    }

    @Override
    public String toString() {
        return "(" + X.toString() + " / " + Y.toString() + ")";
    }
}
