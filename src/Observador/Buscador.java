package Observador;

import Estrategias.Estrategia;
import Estrategias.Funcion;

/**
 *
 * @author Vicente
 */
public class Buscador extends Thread implements Observer{
    private float maximoBuscado;
    private float resultado;
    private EstadoBusqueda estado;
    private Funcion funcion;
    private Estrategia alg;
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
        this.alg= alg;
    }
    
    @Override
    public void actualizar(float nuevoMaximo) {
        maximoBuscado= nuevoMaximo;
    }
    
    @Override
    public void run(){
        while(true){
            resultado= alg.getSolucion(funcion);
            
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
