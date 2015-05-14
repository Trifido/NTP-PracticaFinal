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
public class Division extends DecoradorOperacion {
    Operacion Y;

    public Division(Operacion X, Operacion Y) {
        super(X);
        this.Y = Y;
    }  
    
    @Override
    public Float Resultado() {
        Float dividendo = Y.Resultado();
        
        if(dividendo == 0)
            return X.Resultado() * Float.POSITIVE_INFINITY;
        
        return X.Resultado() / dividendo;
    }
}
