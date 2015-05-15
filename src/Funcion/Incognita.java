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

    Double valor;

    public Incognita(){
        super();
    }

    public Incognita(Double valor) {
        super();
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double Resultado() {
        return valor;
    }

    
    
}
