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
public class FuncionStore {
    SimpleFuncionFactory factoria;
    
    public FuncionStore(){
        factoria= new SimpleFuncionFactory();
    }
    
    public Funcion orderFuncion(String tipo){
        return factoria.crearFuncion(tipo);
    }
}
