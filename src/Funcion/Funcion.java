/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funcion;

import Estrategias.Algoritmo;
import java.util.ArrayList;

/**
 *
 * @author Benjamín y Vicente
 */
public class Funcion extends Operacion{

    protected ArrayList<Incognita> incognitas;
    
    public Funcion() {
        super();
        incognitas = new ArrayList<>();
    }
    
    public Funcion(DecoradorOperacion X) {
        super(X);
        incognitas = new ArrayList<>();
    }
    
    public Funcion(Funcion X) {
        incognitas = new ArrayList<>();
        for(int i = 0; i < X.getNumeroIncognitas(); i++){
            incognitas.add(X.getIncognita(i));
        }
        this.X = X.Get();
    }
    
    public void Set(DecoradorOperacion F){
        X = F;
    }

    public DecoradorOperacion Get() {
        return X;
    }
    
    
    
    public Incognita addIncognita(){
        incognitas.add(new Incognita());
        return incognitas.get(incognitas.size()-1);
    } 
    
    public Incognita getIncognita(int indice){
        return incognitas.get(indice);
    }
    
    public int getNumeroIncognitas(){
        return incognitas.size();
    }
    
    @Override
    public Double Resultado() {
        return X.Resultado();
    }
    
    public void Maximiza(Algoritmo alg){
        alg.busca(this);
    }

    @Override
    public String toString() {
        if (X!=null)
            return X.toString();
        return "";
    }
    
    
}
