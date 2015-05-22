package Observador;

import Estrategias.Algoritmo;
import Funcion.Funcion;
import static java.lang.Thread.sleep;

/**
 *
 * @author Benjamín y Vicente
 */
public class Buscador implements Observer, Runnable{
    private int id;
    private double maximoBuscado;
    private double resultado;
    private EstadoBusqueda estado;
    private Funcion funcion;
    private Algoritmo alg;
    private int intentos;
    
    public Buscador(int id, EstadoBusqueda estado){
        this.id= id;
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
                System.out.println("Buscador-" + id + " maximo: " + resultado);
                estado.setMaximo(resultado);
            }
            else{
                //System.out.println("Buscador-" + id + ": " + resultado);
                intentos++;
            }
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
