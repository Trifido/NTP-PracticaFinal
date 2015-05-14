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
public class Incognita extends DecoradorOperacion{

    Float valor;

    public Incognita(){
        super();
    }

    public Incognita(Float valor) {
        super();
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public Float Resultado() {
        return valor;
    }

    
    
}
