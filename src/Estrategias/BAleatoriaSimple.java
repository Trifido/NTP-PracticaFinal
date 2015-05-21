package Estrategias;

import Funcion.Funcion;

/**
 *
 * @author Benjamín y Vicente
 */
public class BAleatoriaSimple extends Estrategia{
   
    public BAleatoriaSimple(){
        
    }


    @Override
    public Double opera(Funcion fun) {
        for (int i = 0; i < fun.getNumeroIncognitas(); i++)
            fun.getIncognita(i).setValor((Double) (Math.random()*100));
        
        return fun.Resultado();
        
    }
}
