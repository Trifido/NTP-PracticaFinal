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
public class Incognita extends DecoradorOperacion{
    private static int INCOGNITAS = 0;
    private Double valor;
    private int id;

    public Incognita(){
        super();
        id = INCOGNITAS;
        INCOGNITAS++;
        valor = 0.0;
    }

    public Incognita(Double valor) {
        super();
        this.valor = valor;
        id = INCOGNITAS;
        INCOGNITAS++;
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

    @Override
    public String toString() {
        return "X"+id;
    }

    
    
}
