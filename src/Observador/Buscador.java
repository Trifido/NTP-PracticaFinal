package Observador;

import Estrategias.Algoritmo;
import Funcion.Funcion;

/**
 *
 * @author Benjamín y Vicente
 */
public class Buscador implements Observer, Runnable{
    private double maximoBuscado;
    private double resultado;
    private EstadoBusqueda estado;
    private Funcion funcion;
    private Algoritmo alg;
    private int intentos;
    
    public Buscador(EstadoBusqueda estado){
        maximoBuscado= Double.NEGATIVE_INFINITY;
        this.estado= estado;
        intentos= 0;
    }
    
    public void setAlgoritmo(Algoritmo auxAlg){
        this.alg= auxAlg;
    }
    
    public void setFuncion(Funcion funcion){
        this.funcion= funcion;
    }
    
    @Override
    public void actualizar(double nuevoMaximo) {
        maximoBuscado= nuevoMaximo;
    }

    @Override
    public void run() {
        while(true){
            resultado= alg.busca(funcion);
            
            if(resultado > maximoBuscado){
                estado.setMaximo(resultado);
            }
            else{
                intentos++;
            }
            
            //if(intentos>20)
                //cambiarALgoritmo
        }
    }
}
