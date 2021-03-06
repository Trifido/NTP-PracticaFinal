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
 * Clase que representa a las constantes de las funciones, hereda de la clase
 * abstracta DecoradorOperacion
 */
public class Constante  extends DecoradorOperacion{
    Double valor;

    public Constante(Double valor) {
        super();
        this.valor = valor;
    }

    @Override
    public Double Resultado() {
        return valor;
    }  

    @Override
    public String toString() {
        return  valor.toString();
    }
    
    
}
