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
public abstract class Operacion {
    DecoradorOperacion X;
    
    Operacion(){
        X = null;
    }

    public Operacion(DecoradorOperacion X) {
        this.X = X;
    }
    
    public abstract Float Resultado();
    
    
}
