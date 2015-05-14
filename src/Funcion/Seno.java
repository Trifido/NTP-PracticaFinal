/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funcion;

/**
 *
 * @author Benjamín
 */
public class Seno extends DecoradorOperacion{

    public Seno(){
        super();
    }
    
    public Seno(Operacion X) {
        super(X);
    } 

    @Override
    public Float Resultado() {
        return (float) Math.sin(X.Resultado());
    }
    
    
}
