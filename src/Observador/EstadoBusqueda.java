package Observador;

/**
 *
 * @author Vicente
 */
public class EstadoBusqueda extends Observable{
    private double maximo;
    
    public EstadoBusqueda(){
        maximo= Float.NEGATIVE_INFINITY;
    }
    
    public synchronized void setMaximo(double maxBuscador){
        if(maximo < maxBuscador){
            maximo= maxBuscador;
            notificar(maximo);
        }
    }
}
