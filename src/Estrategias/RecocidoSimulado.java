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
 * @author Vicente
 */
public class RecocidoSimulado extends Estrategia{
    protected Random ram;
    
    public RecocidoSimulado(){
        ram= new SecureRandom();
    }
    
    public String getTipo(){
        return "RecocidoSimulado";
    }
    
    @Override
    public Double opera(Funcion fun) {
        for (int i = 0; i < fun.getNumeroIncognitas(); i++){
            fun.getIncognita(i).setValor(ram.nextInt(5)*1.0);
            //System.out.println("B2 X" + (i+1) + "= " + fun.getIncognita(i).getValor());
        }
        
        return fun.Resultado();    
    }
    
}
