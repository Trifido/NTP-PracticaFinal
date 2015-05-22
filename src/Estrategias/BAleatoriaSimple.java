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


    @Override
    public Double opera(Funcion fun) {
        for (int i = 0; i < fun.getNumeroIncognitas(); i++){
            fun.getIncognita(i).setValor(ram.nextInt(1000)*1.0);
            //System.out.println("B1 X" + (i+1) + "= " + fun.getIncognita(i).getValor());
        }
        //System.out.println("Resultado: " + fun.Resultado());
        return fun.Resultado();
        
    }
}
