/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funcion;

import java.util.ArrayList;

/**
 *
 * @author Benjamín
 */
public class Funcion extends Operacion{

    ArrayList<Incognita> incognitas;
    
    public Funcion(DecoradorOperacion X) {
        super(X);
    }
    
    public Incognita addIncognita(){
        Incognita nueva = new Incognita();
        incognitas.add(nueva);
        return nueva;
    } 
    
    public Incognita getIncognita(int indice){
        return incognitas.get(indice);
    }
    
    @Override
    public Double Resultado() {
        return X.Resultado();
    }
    
}
