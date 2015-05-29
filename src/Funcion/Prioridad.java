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
    public class Prioridad implements Comparable<Integer>{
        String valor;
        Integer prio;
        
        Prioridad(String v, Integer p){
            valor = v;
            prio = p;
        }

        @Override
        public int compareTo(Integer t) {
            return prio.compareTo(t);
        }
    }
