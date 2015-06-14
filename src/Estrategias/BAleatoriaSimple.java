package Estrategias;

import Funcion.Funcion;
import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Benjamín y Vicente
 */

/**
 * Clase que representa el algoritmo de Busqueda Aleatoria Simple hereda de 
 * estrategia
 */
public class BAleatoriaSimple extends Estrategia{
    protected Random ram;
    
    public BAleatoriaSimple(){
        ram= new SecureRandom();
    }

    public String getTipo(){
        return "BAleatoriaSimple";
    }

    /**
     * Sobrecarga de la función opera de la clase Estrategia
     * @param fun
     * @return Máximo: double
    */
    @Override
    public Double opera(Funcion fun) {
        for (int i = 0; i < fun.getNumeroIncognitas(); i++){
            double range = Rangos.get(i)[1] - Rangos.get(i)[0];
            fun.getIncognita(i).setValor((ram.nextDouble()*range) + Rangos.get(i)[0]);
        }
        return fun.Resultado();
        
    }
}
