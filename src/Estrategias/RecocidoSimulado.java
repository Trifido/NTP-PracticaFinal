/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategias;

import Funcion.Funcion;

/**
 *
 * @author Vicente
 */
public class RecocidoSimulado extends Estrategia{

    @Override
    public Double opera(Funcion fun) {
        for (int i = 0; i < fun.getNumeroIncognitas(); i++)
            fun.getIncognita(i).setValor((Double) (Math.random()*100));
        
        return fun.Resultado();    }
    
}
