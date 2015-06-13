package Observador;

import javax.swing.JTextField;

/**
 *
 * @author Benjamín y Vicente
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
