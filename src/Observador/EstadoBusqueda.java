package Observador;

import javax.swing.JTextField;

/**
 *
 * @author Benjamín y Vicente
 */

/**
 * Clase observable, se encarga de almacenar el máximo global de la busqueda, se
 * rige por el patrón singleton dentro del patrón observador, también gestiona la 
 * sección crítica del programa, en este caso el máximo.
 */
public class EstadoBusqueda extends Observable{
    private double maximo;
    private static EstadoBusqueda INSTANCE;
    private JTextField textMax;

    public JTextField getTextMax() {
        return textMax;
    }

    public void setTextMax(JTextField textMax) {
        this.textMax = textMax;
    }
    
    public EstadoBusqueda(){
        super();
        maximo= Float.NEGATIVE_INFINITY;
    }
    
    /**
     * Sección crítica del programa, es donde se cambia el máximo global de la
     * busqueda.
     * @param maxBuscador
    */
    public synchronized void setMaximo(double maxBuscador){
        if(maximo < maxBuscador){
            maximo= maxBuscador;
            notificar(maximo);
            textMax.setText(maximo + "");
        }
    }
    
    public static EstadoBusqueda getInstance() {
        if(INSTANCE == null)
            INSTANCE= new EstadoBusqueda();
        return INSTANCE;
    }
    
    @Override
    public String toString(){
        return maximo + "";
    }
    
    
}
