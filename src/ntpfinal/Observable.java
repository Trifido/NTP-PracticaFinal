package ntpfinal;

import java.util.ArrayList;

/**
 *
 * @author Vicente
 */
public abstract class Observable {
    private ArrayList<Observer> observadores;
    
    public void addObservador(Observer ob){
        observadores.add(ob);
    }
    
    public void removeObservador(Observer ob){
        observadores.remove(ob);
    }
    
    protected void notificar(float nuevoMaximo){
        for(Observer ob : observadores)
            ob.actualizar(nuevoMaximo);
    }
}
