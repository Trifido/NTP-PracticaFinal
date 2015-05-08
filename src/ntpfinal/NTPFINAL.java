package ntpfinal;

/**
 *
 * @author Vicente
 */
public class NTPFINAL {

    public static void main(String[] args) {
        Observable estado= new EstadoBusqueda();
        Observer buscador= new Buscador((EstadoBusqueda) estado);
        Funcion funcion= new Funcion();
        Algoritmo alg= new BAleatoriaSimple();
        
        ((Buscador)buscador).setFuncion(funcion);
        ((Buscador)buscador).setAlgoritmo(alg);
    }
    
}
