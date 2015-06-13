package ntpfinal;

import Estrategias.Algoritmo;
import Estrategias.EstrategiaStore;
import Funcion.Funcion;
import Funcion.FuncionStore;
import Funcion.Incognita;
import Funcion.Operaciones;
import Observador.Observable;
import Observador.EstadoBusqueda;
import Observador.Buscador;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Benjamín y Vicente
 */
public class NTPFINAL {

    public static void main(String[] args) {
        //Inicializamos el observable (SC) y los observadores (hebras)
        Observable estado= EstadoBusqueda.getInstance();
        Buscador buscador1= new Buscador(1);
        Buscador buscador2= new Buscador(2);
        Buscador buscador3= new Buscador(0);
        
        
        estado.addObservador(buscador1);
        estado.addObservador(buscador2);
        estado.addObservador(buscador3);
        //Creamos una funcion
        Funcion f = new Funcion();
        Incognita x1 = f.addIncognita();
        Incognita x2 = f.addIncognita();
        
        f.Set(Operaciones.Sum(21.5, Operaciones.Mul(x1, Operaciones.Sin(Operaciones.Mul(4* Math.PI, x1)))));
        f.Set(Operaciones.Sum(f.Get(), Operaciones.Mul(x2, Operaciones.Sin(Operaciones.Mul(20* Math.PI, x2)))));
        
        System.out.println(f);
        
        Funcion f2 = new Funcion();
        Incognita x11 = f2.addIncognita();
        Incognita x22 = f2.addIncognita();
       
        f2.Set(Operaciones.Sum(21.5, Operaciones.Mul(x11, Operaciones.Sin(Operaciones.Mul(4* Math.PI, x11)))));
        f2.Set(Operaciones.Sum(f2.Get(), Operaciones.Mul(x22, Operaciones.Sin(Operaciones.Mul(20* Math.PI, x22)))));
        
        Funcion f3 = new Funcion();
        Incognita x111 = f3.addIncognita();
        Incognita x222 = f3.addIncognita();
       
        f3.Set(Operaciones.Sum(21.5, Operaciones.Mul(x111, Operaciones.Sin(Operaciones.Mul(4* Math.PI, x111)))));
        f3.Set(Operaciones.Sum(f3.Get(), Operaciones.Mul(x222, Operaciones.Sin(Operaciones.Mul(20* Math.PI, x222)))));
        //
        FuncionStore fs= new FuncionStore();
        //Añadimos a los observadores la función
        buscador1.setFuncion(fs.orderFuncion(3));
        buscador2.setFuncion(fs.orderFuncion(3));
        buscador3.setFuncion(fs.orderFuncion(3));
        
        //Factoría Estrategia
        EstrategiaStore factoria= new EstrategiaStore();
        
        
        //Añadimos a los observadores los 3 algoritmos
        ArrayList<Algoritmo> algoritmos= new ArrayList();
        algoritmos.add(new Algoritmo(factoria.orderEstrategia("simple")));
        algoritmos.add(new Algoritmo(factoria.orderEstrategia("multiple")));
        algoritmos.add(new Algoritmo(factoria.orderEstrategia("recocido")));  
        
        algoritmos.get(0).addRange(-0.5, 0.5);
        algoritmos.get(1).addRange(-0.5, 0.5);
        algoritmos.get(2).addRange(-0.5, 0.5);
        
        buscador1.setAlgoritmo(algoritmos);
        buscador2.setAlgoritmo(algoritmos);
        buscador3.setAlgoritmo(algoritmos);
        
        //Creamos un contenedor de hebras y ejecutamos las hebras buscadoras
        ExecutorService executor= Executors.newFixedThreadPool(3);
        executor.execute(buscador1);
        executor.execute(buscador2);
        executor.execute(buscador3);
    }
    
}
