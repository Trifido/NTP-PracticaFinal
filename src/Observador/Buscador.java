package Observador;

import Estrategias.Algoritmo;
import Funcion.Funcion;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Benjamín y Vicente
 */

/**
 * Clase observador se encarga administrar una estrategia en concreto, implementa 
 * runnable para poder tener varios buscadores simultaneos buscando el máximo de 
 * la función, también se encarga de decidir cuando cambiar de estrategia en 
 * caliente y de actualzar el máximo global encontrado.
 */
public class Buscador implements Observer, Runnable{
    private final int id;
    private double maximoBuscado;
    private double resultado;
    private final EstadoBusqueda estado;
    private Funcion funcion;
    private Algoritmo algActivo;
    private ArrayList<Algoritmo>algoritmos;
    private int intentos;
    private String estrategiaActiva;
    private JTextField textCampo;
    
    public Buscador(int id){
        this.id= id;
        this.maximoBuscado= Double.NEGATIVE_INFINITY;
        this.estado= EstadoBusqueda.getInstance();
        this.intentos= 0;
        algoritmos= new ArrayList<>();
    }

    public JTextField getTextCampo() {
        return textCampo;
    }

    public void setTextCampo(JTextField textCampo) {
        this.textCampo = textCampo;
        this.textCampo.setText(estrategiaActiva);
    }
    
    
    
    public void setAlgoritmo(ArrayList<Algoritmo> algs){
        this.algoritmos= algs;
        this.algActivo= algoritmos.get(id);
        this.estrategiaActiva= this.algActivo.getTipo();
    }
    
    public void setFuncion(Funcion funcion){
        this.funcion= funcion;
    }
    
    /**
     * Sobrecarga de la función actualizar de la clase observer
     * @param nuevoMaximo
     */
    
    @Override
    public void actualizar(double nuevoMaximo) {
        maximoBuscado= nuevoMaximo;
    }
    
    /**
     * Función que se encarga de decidir el criterio para cambiar de estrategia.
     */
    private void cambioEstrategia(){
        intentos++;
        if(intentos==20){
            this.algActivo= algoritmos.get((id+1)%3);
            this.estrategiaActiva= algoritmos.get((id)%3).getTipo();
        }
        else if(intentos==40){
            this.algActivo= algoritmos.get((id+2)%3);
             this.estrategiaActiva= algoritmos.get((id+1)%3).getTipo();
        }
        else if(intentos==60){
            this.algActivo= algoritmos.get((id+3)%3);
            this.estrategiaActiva= algoritmos.get((id+2)%3).getTipo();
            intentos=0;
        }
        
        textCampo.setText(estrategiaActiva);
    }

    /**
     * Sobrecarga de la función run de la interfaz Runnable, crea un bucle infinito
     * llamando al algoritmo para buscar el máximo, si encuentra un valor mayor 
     * al que ya hay, actualiza el estado, sinó revisa los criterios de cambio de
     * estrategia y si lo cumple cambia.
     */
    @Override
    public void run() {
        while(true){
            resultado= algActivo.busca(funcion);
            
            if(resultado > maximoBuscado){
                estado.setMaximo(resultado);
            }
            else{
                this.cambioEstrategia();
            }
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public String toString(){
        return algActivo.getTipo();
    }
}
