package Estrategias;

import Funcion.Funcion;
import java.util.ArrayList;

/**
 *
 * @author Benjamín y Vicente
 */

/**
 * Clase abstracta que representa la manera de encontrar el máximo de una función
*/

public abstract class Estrategia {
    ArrayList<Double[]> Rangos;
    
    public Estrategia() {
        Rangos = new ArrayList<>();
    }
    
    public abstract String getTipo();
    
    /**
     * Añade el rango en el que se buscará el máximo de la función.
    */
    void addRange(double min, double max){
        Double []aux={min,max};
        Rangos.add(aux);
        Rangos.add(aux);
    }
    /**
     * Define el comportamiento de la estrategia a usar para encontrar el máximo
     * @param fun
     * @return Máximo: double
    */
    public abstract Double opera(Funcion fun);
}
