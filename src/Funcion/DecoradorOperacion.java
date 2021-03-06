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
 * Clase abstracta que hereda de la clase abstracta Operacion, a partir de esta clase
 * podemos montar funciones mas complejas.
 */
public abstract class DecoradorOperacion extends Operacion {
    Operacion X;

    public DecoradorOperacion() {
        X = null;
    }
    
    public DecoradorOperacion(Operacion X) {
        this.X = X;
    }
    
    @Override
    public abstract Double Resultado();
    
}
