package Estrategias;

import Funcion.Funcion;
import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Benjamín y Vicente
 */
public class BAleatoriaSimple extends Estrategia{
    protected Random ram;
    
    public BAleatoriaSimple(){
        ram= new SecureRandom();
    }

    public String getTipo(){
        return "BAleatoriaSimple";
    }

    @Override
    public Double opera(Funcion fun) {
        for (int i = 0; i < fun.getNumeroIncognitas(); i++){
            double range = Rangos.get(i)[1] - Rangos.get(i)[0];
            fun.getIncognita(i).setValor((ram.nextDouble()*range) + Rangos.get(i)[0]);
        }
        return fun.Resultado();
        
    }
}
