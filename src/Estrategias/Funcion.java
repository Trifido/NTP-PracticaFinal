package Estrategias;

/**
 *
 * @author Vicente
 */
public class Funcion {
    public Funcion(){}
    
    public float resultado(float x, float y){
        return (float) (21.5 + x*Math.sin(4*Math.PI*x) + y*Math.sin(20*Math.PI*y));
    }
}
