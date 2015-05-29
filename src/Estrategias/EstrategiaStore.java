/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategias;

/**
 *
 * @author Benjamín y Vicente
 */
public class EstrategiaStore {
    SimpleEstrategiaFactory factoria;
    
    public EstrategiaStore(){
        factoria= new SimpleEstrategiaFactory();
    }
    
    public Estrategia orderEstrategia(String tipo){
        return factoria.crearEstrategia(tipo);
    }
    
}
