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
    
    void addRange(double min, double max){
        Rangos.add(new Double[]{min, max});
    }
    
    public abstract Double opera(Funcion fun);
}
