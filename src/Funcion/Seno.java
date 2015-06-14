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
 * Clase que representa a la operación Seno, extiende de DecoradorOperacion
 */
public class Seno extends DecoradorOperacion{

    public Seno(){
        super();
    }
    
    public Seno(Operacion X) {
        super(X);
    } 

    @Override
    public Double Resultado() {
        return Math.sin(X.Resultado());
    }
    
    @Override
    public String toString() {
        return "Sin(" + X.toString() + ")";
    }
}
