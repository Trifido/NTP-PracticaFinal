package ntpfinal;

import Estrategias.BAleatoriaSimple;
import Estrategias.Estrategia;
import Estrategias.Funcion;
import Observador.Observer;
import Observador.Observable;
import Observador.EstadoBusqueda;
import Observador.Buscador;

/**
 *
 * @author Vicente
 */
public class NTPFINAL {

    public static void main(String[] args) {
        Observable estado= new EstadoBusqueda();
        Observer buscador= new Buscador((EstadoBusqueda) estado);
        Funcion funcion= new Funcion();
        Estrategia alg= new BAleatoriaSimple();
        
        ((Buscador)buscador).setFuncion(funcion);
        ((Buscador)buscador).setAlgoritmo(alg);
    }
    
}
