package Estrategias;

/**
 *
 * @author Vicente
 */
public class BAleatoriaSimple implements Estrategia{
    private float x, y;
    private float resultado;
    
    public BAleatoriaSimple(){
        x= y= 0.0f;
    }
    
    @Override
    public float getSolucion(Funcion funcion) {
        x= (float) (Math.random()*100);
        y= (float) (Math.random()*100);
        
        
        //funcion.getIngnita(0).setValue(X);
        
        
        return funcion.resultado(x, y);
    } 
}
