/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funcion;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author Benjamín y Vicente
 */
public class Operaciones {
    
      /////////////////////////////////////////////////////
     //                    Suma                         //
    /////////////////////////////////////////////////////
    public static DecoradorOperacion Sum(Operacion x1, Operacion x2){
        return new Suma(x1, x2);
    }
    
    public static DecoradorOperacion Sum(Double x1, Operacion x2){
        return new Suma(new Constante(x1), x2);
    }
    
    public static DecoradorOperacion Sum(Operacion x1, Double x2){
        return new Suma(x1, new Constante(x2));
    }
    
      /////////////////////////////////////////////////////
     //                    Resta                        //
    /////////////////////////////////////////////////////
    
    public static DecoradorOperacion Res(Operacion x1, Operacion x2){
        return new Resta(x1, x2);
    }
    
    public static DecoradorOperacion Res(Double x1, Operacion x2){
        return new Resta(new Constante(x1), x2);
    }
    
    public static DecoradorOperacion Res(Operacion x1, Double x2){
        return new Resta(x1, new Constante(x2));
    }
    
      /////////////////////////////////////////////////////
     //                 Producto                        //
    /////////////////////////////////////////////////////
    
    
    public static DecoradorOperacion Mul(Operacion x1, Operacion x2){
        return new Producto(x1, x2);
    }
    
    public static DecoradorOperacion Mul(Double x1, Operacion x2){
        return new Producto(new Constante(x1), x2);
    }
    
    public static DecoradorOperacion Mul(Operacion x1, Double x2){
        return new Producto(x1, new Constante(x2));
    }
    
    
      /////////////////////////////////////////////////////
     //                  División                       //
    /////////////////////////////////////////////////////
    
    
    public static DecoradorOperacion Div(Operacion x1, Operacion x2){
        return new Division(x1, x2);
    }
    
    public static DecoradorOperacion Div(Double x1, Operacion x2){
        return new Division(new Constante(x1), x2);
    }
    
    public static DecoradorOperacion Div(Operacion x1, Double x2){
        return new Division(x1, new Constante(x2));
    }
    
      /////////////////////////////////////////////////////
     //         Funciones Trigonométricas               //
    /////////////////////////////////////////////////////
    
    
    public static DecoradorOperacion Sin(Operacion operacion){
        return new Seno(operacion);
    }
    
    public static DecoradorOperacion Cos(Operacion operacion){
        return new Coseno(operacion);
    }
    
    public static DecoradorOperacion Tan(Operacion operacion){
        return new Tangente(operacion);
    }
    
      /////////////////////////////////////////////////////
     //              Parse de funciones                 //
    /////////////////////////////////////////////////////
    
    public static Funcion StrToFun(String equation){
        PriorityQueue<Prioridad> oper = new PriorityQueue<>();
        PriorityQueue<Prioridad> val = new PriorityQueue();
        ArrayList<String> inc = new ArrayList<>();
        
        Funcion f = new Funcion();
        
      //  String regex = "(?<=op)|(?=op)".replace("op", "[-+*/()]");

    // actual regex becomes (?<=[-+*/()])|(?=[-+*/()])
/*
        String[] parse = equation.split(regex);
        int prioridad = 0;
        
        for(String i : parse){
            boolean isNumber = true;
            
            try
            {
              Double.parseDouble(i);
            }
            catch(NumberFormatException e)
            {
              isNumber = false;
            }
            
            if(isNumber){
                val.add(new Prioridad(i, prioridad));
            }else{
                switch(i){
                    case "(":
                        prioridad++;
                        break;
                    case ")":
                        prioridad--;
                        break;
                    case "+":
                        oper.add(new Prioridad(i, prioridad));
                        break;
                    case "-":
                        oper.add(new Prioridad(i, prioridad));
                        break;
                    case "*":
                        oper.add(new Prioridad(i, prioridad));
                        break;
                    case "/":
                        oper.add(new Prioridad(i, prioridad));
                        break;
                    case "sin":
                        oper.add(new Prioridad(i, prioridad));
                        break;
                    case "cos":
                        oper.add(new Prioridad(i, prioridad));
                        break;
                    case "tan":
                        oper.add(new Prioridad(i, prioridad));
                        break;  
                        
                    default:
                        if (!inc.contains(i)){
                            f.addIncognita();
                            inc.add(i);
                        }
                        val.add(new Prioridad(i, prioridad));
                        break;
                
                }
            }
        }
        */
          return f; 
    }
    
    
    
}
