package ntpfinal;

import Estrategias.Algoritmo;
import Estrategias.BAleatoriaSimple;
import Estrategias.Estrategia;
import Funcion.Funcion;
import Observador.Observer;
import Observador.Observable;
import Observador.EstadoBusqueda;
import Observador.Buscador;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Vicente
 */
public class NTPFINAL {

    public static void main(String[] args) {
        //Inicializamos el observable (SC) y los observadores (hebras)
        Observable estado= new EstadoBusqueda();
        Buscador buscador1= new Buscador((EstadoBusqueda) estado);
        Buscador buscador2= new Buscador((EstadoBusqueda) estado);
        
        //Creamos una funcion
        //Funcion func= new Funcion();
        
        //Añadimos a los observadores la función
        buscador1.setFuncion(null);
        buscador1.setFuncion(null);
        
        //Añadimos a los observadores el algoritmo
        Algoritmo alg= new Algoritmo(new BAleatoriaSimple());
        Algoritmo alg2= new Algoritmo(new BAleatoriaSimple());
        buscador1.setAlgoritmo(alg);
        buscador1.setAlgoritmo(alg2);
        
        //Creamos un contenedor de hebras y ejecutamos las hebras buscadoras
        ExecutorService executor= Executors.newFixedThreadPool(2);
        executor.execute(buscador1);
        executor.execute(buscador2);
        
     /*   Observable estado= new EstadoBusqueda();
        Observer buscador= new Buscador((EstadoBusqueda) estado);
        Funcion funcion= new Funcion();
        Estrategia alg= new BAleatoriaSimple();
        
        ((Buscador)buscador).setFuncion(funcion);
        ((Buscador)buscador).setAlgoritmo(alg);
    */
    }
    
}
