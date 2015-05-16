package Observador;

/**
 *
 * @author Vicente
 */
public class EstadoBusqueda extends Observable{
    private float maximo;
    
    public EstadoBusqueda(){
        maximo= Float.NEGATIVE_INFINITY;
    }
    
    public synchronized void setMaximo(float maxBuscador){
        if(maximo < maxBuscador){
            maximo= maxBuscador;
            notificar(maximo);
        }
    }
}
