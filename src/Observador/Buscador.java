package Observador;

import Estrategias.Algoritmo;
import Estrategias.Estrategia;
import Funcion.Funcion;

/**
 *
 * @author Vicente
 */
public class Buscador extends Thread implements Observer{
    private double maximoBuscado;
    private double resultado;
    private EstadoBusqueda estado;
    private Funcion funcion;
    private Estrategia est;
    private Algoritmo alg;
    private int intentos;
    
    public Buscador(EstadoBusqueda estado){
        maximoBuscado= Float.NEGATIVE_INFINITY;
        this.estado= estado;
        intentos= 0;
    }
    
    public void setFuncion(Funcion funcion){
        this.funcion= funcion;
    }
    
    public void setAlgoritmo(Estrategia alg){
        this.est= alg;
    }
    
    @Override
    public void actualizar(double nuevoMaximo) {
        maximoBuscado= nuevoMaximo;
    }
    
    @Override
    public void run(){
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
