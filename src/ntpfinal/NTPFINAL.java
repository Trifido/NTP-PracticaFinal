package ntpfinal;

import Estrategias.Algoritmo;
import Estrategias.BAleatoriaSimple;
import Estrategias.Estrategia;
import Estrategias.RecocidoSimulado;
import Funcion.Funcion;
import Funcion.Incognita;
import Funcion.Operaciones;
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
        Buscador buscador1= new Buscador(1,(EstadoBusqueda) estado);
        Buscador buscador2= new Buscador(2,(EstadoBusqueda) estado);
        
        estado.addObservador(buscador1);
        estado.addObservador(buscador2);
        //Creamos una funcion
        Funcion f = new Funcion();
        Incognita x1 = f.addIncognita();
        Incognita x2 = f.addIncognita();
       
        f.Set(Operaciones.Sum(21.5, Operaciones.Mul(x1, Operaciones.Sin(Operaciones.Mul(4* Math.PI, x1)))));
        f.Set(Operaciones.Sum(f.Get(), Operaciones.Mul(x2, Operaciones.Sin(Operaciones.Mul(20* Math.PI, x2)))));
        
        //Añadimos a los observadores la función
        buscador1.setFuncion(f);
        buscador2.setFuncion(f);
        
        //Añadimos a los observadores el algoritmo
        Algoritmo alg= new Algoritmo(new BAleatoriaSimple());
        Algoritmo alg2= new Algoritmo(new RecocidoSimulado());
        buscador1.setAlgoritmo(alg);
        buscador2.setAlgoritmo(alg2);
        
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
