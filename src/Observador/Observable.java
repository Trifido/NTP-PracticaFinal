package Observador;

import java.util.ArrayList;

/**
 *
 * @author Benjamín y Vicente
 */

/**
 * Clase abstracta observable, contiene un array de observadores el cual llama 
 * a cada uno a actualizar cuando se hace una notificación.
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
    
    /**
     * Funcion que cuando se notifica un nuevo máximo, actualiza el máximo del 
     * resto de observadores
     * @param nuevoMaximo 
     */
    protected void notificar(double nuevoMaximo){
        observadores.stream().forEach((ob) -> {
            ob.actualizar(nuevoMaximo);
        });
    }
}
