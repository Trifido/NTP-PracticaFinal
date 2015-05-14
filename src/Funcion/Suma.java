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
public class Suma extends DecoradorOperacion {
    Operacion Y;

    public Suma(Operacion X, Operacion Y) {
        super(X);
        this.Y = Y;
    }   
    
    @Override
    public Float Resultado() {
        return X.Resultado() + Y.Resultado();
    }
    
}