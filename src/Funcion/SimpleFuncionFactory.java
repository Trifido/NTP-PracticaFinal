package Funcion;

/**
 *
 * @author Benjamín y Vicente
 */
public class SimpleFuncionFactory {
    public SimpleFuncionFactory(){}
    
    public Funcion crearEstrategia(String tipo){
        Funcion func= new Funcion();
        switch(tipo){
            case "sin":
                Incognita x = func.addIncognita();
                func.Set(Operaciones.Sin(x));   
                return func;
            case "cos":
                Incognita y = func.addIncognita();
                func.Set(Operaciones.Cos(y));   
                return func;
            case "infinito":
                Incognita x1 = func.addIncognita();
                Operacion divisor = Operaciones.Res(Operaciones.Mul(x1, x1), 1.0); 
                func.Set(Operaciones.Div(Operaciones.Mul(2.0, x1), Operaciones.Mul(divisor, divisor)));   
                return func;
            case "practica":
                Incognita y1 = func.addIncognita();
                Incognita y2 = func.addIncognita();
                func.Set(Operaciones.Sum(21.5, Operaciones.Mul(y1, Operaciones.Sin(Operaciones.Mul(4* Math.PI, y1)))));
                func.Set(Operaciones.Sum(func.Get(), Operaciones.Mul(y2, Operaciones.Sin(Operaciones.Mul(20* Math.PI, y2)))));
                return func;
            case "practica-2":
                Incognita z1 = func.addIncognita();
                Incognita z2 = func.addIncognita();
                func.Set(Operaciones.Sum(21.5, Operaciones.Mul(z1, Operaciones.Cos(Operaciones.Mul(4* Math.PI, z1)))));
                func.Set(Operaciones.Sum(func.Get(), Operaciones.Mul(z2, Operaciones.Cos(Operaciones.Mul(20* Math.PI, z2)))));
                return func;
            default:
                return func;
        }
    }
}

