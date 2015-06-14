/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategias;

import Funcion.Funcion;
import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Benjamín y Vicente
 */

/**
 * Clase que representa el algoritmo de Busqueda Aleatoria Multiple hereda de 
 * estrategia
 */

public class BAleatoriaMultiple extends Estrategia{
    protected Random ram;
    double maximo;
    
    public BAleatoriaMultiple(){
        ram= new SecureRandom();
    }
    
    @Override
    public String getTipo(){
        return "BAleatoriaMultiple";
    }
    /**
     * Sobrecarga de la función opera de la clase Estrategia
     * @param fun
     * @return Máximo: double
    */
    @Override
    public Double opera(Funcion fun) {
        for (int i = 0; i < fun.getNumeroIncognitas(); i++){
            double range = Rangos.get(i)[1] - Rangos.get(i)[0];
            fun.getIncognita(i).setValor((ram.nextDouble()*range) + Rangos.get(i)[0]);
        }
        maximo= fun.Resultado();
        
        
        for (int i = 0; i < fun.getNumeroIncognitas(); i++){
            double range = Rangos.get(i)[1] - Rangos.get(i)[0];
            fun.getIncognita(i).setValor((ram.nextDouble()*range) + Rangos.get(i)[0]);
        }
        
        if(maximo < fun.Resultado())
            maximo= fun.Resultado();
        
        return maximo;
    }
}
