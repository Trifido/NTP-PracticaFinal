/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funcion;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    public static void StrToFun(String equation){
        ArrayList<String> oper = new ArrayList<>();
        ArrayList<String> val = new ArrayList<>();
        
        /*int token  = 0;
        boolean isAntNumber = false;
        String cadena = str.toUpperCase();
        
        /*ArrayList<Character> oper = new ArrayList<>();
        ArrayList<Character> val = new ArrayList<>();* /
        
        
        for (token = 0; token < str.length(); token++){
            char car = cadena.charAt(token);
            
            switch(car){
             case '+':
             case '-':
             case '*':
             case '/':
                oper.add(car);
                break;
             case 'S':
                 if (cadena.substring(token, token+3).compareTo("SIN") == 0){
                     token+=2;
                     oper.add(car);
                     System.out.println("Añade SIN " + cadena.charAt(token));
                 }
                 break;
            
             case 'C':
                 if (cadena.substring(token, token+3).compareTo("COS") == 0){
                     token+=3;
                     oper.add(car);
                 }
                 break;
                 
             case 'T':
                 if (cadena.substring(token, token+3).compareTo("TAN") == 0){
                     token+=2;
                     oper.add(car);
                 }
                 break;
            }
        }*/
        
        String regex = "(?<=op)|(?=op)".replace("op", "[-+*/()]");

    // actual regex becomes (?<=[-+*/()])|(?=[-+*/()])

        String[] parse = equation.split(regex);
        int prioridad = 0;
        
        for(String i : parse){
            if(Double.isNaN(Double.parseDouble(i))){
                
            }else{
                
            }
        }
        
           
        }
    
    
    
}
