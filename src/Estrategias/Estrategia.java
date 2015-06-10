package Estrategias;

import Funcion.Funcion;
import java.util.ArrayList;

/**
 *
 * @author Benjamín y Vicente
 */
public abstract class Estrategia {
    ArrayList<Double[]> Rangos;
    
    public Estrategia() {
        Rangos = new ArrayList<>();
    }
    
    public abstract String getTipo();
    
    void addRange(double min, double max){
        Double []aux={min,max};
        Rangos.add(aux);
        Rangos.add(aux);
    }
    
    public abstract Double opera(Funcion fun);
}
