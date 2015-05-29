package Observador;

import Estrategias.Algoritmo;
import Funcion.Funcion;
import static java.lang.Thread.sleep;
import java.util.ArrayList;

/**
 *
 * @author Benjamín y Vicente
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
    
    public Buscador(int id){
        this.id= id;
        this.maximoBuscado= Double.NEGATIVE_INFINITY;
        this.estado= EstadoBusqueda.getInstance();
        this.intentos= 0;
        algoritmos= new ArrayList<>();
    }
    
    public void setAlgoritmo(ArrayList<Algoritmo> algs){
        this.algoritmos= algs;
        this.algActivo= algoritmos.get(id);
        this.estrategiaActiva= this.algActivo.getTipo();
    }
    
    public void setFuncion(Funcion funcion){
        this.funcion= funcion;
    }
    
    @Override
    public void actualizar(double nuevoMaximo) {
        maximoBuscado= nuevoMaximo;
    }
    
    private void cambioEstrategia(){
        intentos++;
        if(intentos==20){
            this.algActivo= algoritmos.get((id+1)%3);
            System.out.println("ID-" + this.id + "  Cambiado a " + this.estrategiaActiva);
        }
        else if(intentos==40){
            this.algActivo= algoritmos.get((id+2)%3);
            System.out.println("ID-" + this.id + "  Cambiado a " + this.estrategiaActiva);
        }
        else if(intentos==60){
            this.algActivo= algoritmos.get((id+3)%3);
            System.out.println("ID-" + this.id + "  Cambiado a " + this.estrategiaActiva);
            intentos=0;
        }
    }

    @Override
    public void run() {
        while(true){
            resultado= algActivo.busca(funcion);
            
            if(resultado > maximoBuscado){
                System.out.println("Buscador-" + id + " maximo: " + resultado);
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
}
