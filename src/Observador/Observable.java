package Observador;

import java.util.ArrayList;

/**
 *
 * @author Benjamín y Vicente
 */
public abstract class Observable {
    private ArrayList<Observer> observadores;
    
    Observable(){
        observadores= new ArrayList();
    }
    
    public void addObservador(Observer ob){
        observadores.add(ob);
    }
    
    public void removeObservador(Observer ob){
        observadores.remove(ob);
    }
    
    protected void notificar(double nuevoMaximo){
        observadores.stream().forEach((ob) -> {
            ob.actualizar(nuevoMaximo);
        });
    }
}
