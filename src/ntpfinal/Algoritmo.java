/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntpfinal;

/**
 *
 * @author Vicente
 */
public class Algoritmo {
    private Estrategia estrategia;
    
    public Algoritmo(Estrategia aux){
        estrategia= aux;
    }
    
    public Estrategia getEstrategia(){
        return estrategia;
    }
    
}
