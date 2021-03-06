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
 * Clase que representa a la operación Tangente, extiende de DecoradorOperacion
 */
public class Tangente extends DecoradorOperacion{

    public Tangente(){
        super();
    }
    
    public Tangente(Operacion X) {
        super(X);
    } 

    @Override
    public Double Resultado() {
        return Math.cos(X.Resultado());
    }
    
    @Override
    public String toString() {
        return "Tan(" + X.toString() + ")";
    }
}
