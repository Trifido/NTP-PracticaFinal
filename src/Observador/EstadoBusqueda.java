package Observador;

/**
 *
 * @author Benjamín y Vicente
 */
public class EstadoBusqueda extends Observable{
    private double maximo;
    
    public EstadoBusqueda(){
        super();
        maximo= Float.NEGATIVE_INFINITY;
    }
    
    public synchronized void setMaximo(double maxBuscador){
        if(maximo < maxBuscador){
            maximo= maxBuscador;
            notificar(maximo);
            System.out.println("Maximo: " + maximo);
        }
    }
}
