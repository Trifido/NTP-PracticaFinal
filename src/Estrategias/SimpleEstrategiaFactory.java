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
public class SimpleEstrategiaFactory {
    
    public SimpleEstrategiaFactory(){}
    
    public Estrategia crearEstrategia(String tipo){
        switch(tipo){
            case "simple":
                return new BAleatoriaSimple();
            case "multiple":
                return new BAleatoriaMultiple();
            case "recocido":
                return new RecocidoSimulado();
            default:
                return new BAleatoriaSimple();
        }
    }
}
