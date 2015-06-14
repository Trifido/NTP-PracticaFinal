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
 * Clase que representa a la operación Resta, extiende de DecoradorOperacion,
 * en el constructor se pasan por parametros dos objetos Operacion.
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
    
    @Override
    public String toString() {
        return "(" + X.toString() + " - " + Y.toString() + ")";
    }
}
