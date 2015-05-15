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
public class Resta extends DecoradorOperacion  {
    Operacion Y;

    public Resta(Operacion X, Operacion Y) {
        super(X);
        this.Y = Y;
    }   
    
    @Override
    public Double Resultado() {
        return X.Resultado() - Y.Resultado();
    }
}
