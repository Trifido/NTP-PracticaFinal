/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Drawable;

import Funcion.DecoradorOperacion;
import Funcion.Funcion;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Benjamín y Vicente
 */

/**
 * Clase que hereda de función ya que a partir de las incognitas y la propia
 * función dibuja en el lienzo los puntos resultantes que va obteniendo de un
 * rango de valores.
 */
public class FuncionDibujable extends Funcion implements Drawable{

    int Precision;
    double rangoMinX, rangoMaxX;
    double rangoMinY, rangoMaxY;
    
    double distanciaX, distanciaY;
    
    ArrayList<Integer> puntosX;
    ArrayList<Integer> puntosY;
    
    int centroX;
    int centroY;

    public FuncionDibujable() {
        initPorDefecto();
    }

    public FuncionDibujable(DecoradorOperacion X) {
        super(X);
        initPorDefecto();
    }
    
    public FuncionDibujable(Funcion X) {
        super(X);
        initPorDefecto();
    }
    
    /**
     * Valores por defecto
     */
    private void initPorDefecto(){
        Precision = 100000;
        rangoMaxX = 10;
        rangoMinX = -10;
        
        rangoMaxY = 10;
        rangoMinY = -10;
        
        puntosX = new ArrayList<>();
        puntosY = new ArrayList<>();
        
    }
    
    /**
     * Las funciones swap las usamos por si el RangoMax introducido es menor
     * que el RangoMin.
     */
    void swapX(){
        if(rangoMaxX < rangoMinX){
            double aux = rangoMaxX;
            rangoMaxX = rangoMinX;
            rangoMinX = aux;
        }
    }
    
    void swapY(){
        if(rangoMaxY < rangoMinY){
            double aux = rangoMaxY;
            rangoMaxY = rangoMinY;
            rangoMinY = aux;
        }
    }

    public int getPrecision() {
        return Precision;
    }

    public void setPrecision(int Precision) {
        this.Precision = Math.abs(Precision);
    }

    public double getRangoMinX() {
        return rangoMinX;
    }
    
    public double getRangoMaxX() {
        return rangoMaxX;
    }

    public void setRangoX(double MinX, double MaxX) {
        rangoMinX = MinX;
        rangoMaxX = MaxX;
        puntosX.clear();
        puntosY.clear();
        swapX();
    }

    public double getRangoMinY() {
        return rangoMinY;
    }
    
    public double getRangoMaxY() {
        return rangoMaxY;
    }
    
    public void setRangoY(double MinY, double MaxY) {
        rangoMinY = MinY;
        rangoMaxY = MaxY;
        puntosX.clear();
        puntosY.clear();
        swapY();
    }
    
    /**
     * Función que usamos para obtener los puntos de la función e interpolarlos
     * para así poder dibujarlos en el lienzo.
     */
    void calculaPuntos(int ancho, int alto){
        distanciaX = Math.abs(rangoMaxX - rangoMinX);
        distanciaY = Math.abs(rangoMaxY - rangoMinY);
        
        double salto = distanciaX / Precision;
        
        centroX = -interpotarRespectoX(rangoMinX, ancho);
        centroY = - interpotarRespectoY(rangoMaxY, alto);
        
        double x = rangoMinX;
        double y;
        
        for (int i = 0; i < Precision; i++){
            this.incognitas.get(0).setValor(x);
            y = this.Resultado();
            x += salto;
            
            puntosX.add(centroX + interpotarRespectoX(x, ancho));
            puntosY.add(centroY + (interpotarRespectoY(y, alto))); 
        }
    
    }
    
    int interpotarRespectoX(double valor, int ancho){
        return (int) ((valor * ancho)/distanciaX);
    }
    
    int interpotarRespectoY(double valor, int alto){
        return (int) (-(valor * alto)/distanciaY);
    }
    
    /**
     * Función que dibuja el eje de coordenadas y los distintos valores.
     * La marcación de rayas más grandes para lo enteros: 1,2,3,...
     * La marcación con rayas más pequeñas para: 1.5, 2.5, 3.5,....
     */
    void paintCuadricula(Graphics g,int ancho,int alto){
        
        int tamMedia = 20;
        int tamPeque = 10;
        
        g.setColor(Color.BLACK);
        g.fillRect(centroX, 0, 1, alto);
        g.fillRect(0, centroY, alto, 1);
        
        
        for(int i = (int) Math.ceil(rangoMinX); i < rangoMaxX; i++){
            int interI = interpotarRespectoX(i, ancho);
            g.fillRect(interI + centroX, centroY - (tamMedia/2), 1, tamMedia);
            
            if(i != 0)
                g.drawString(i+"", interI + centroX-3, centroY - (tamMedia/2));
            
            int interMediaI = interpotarRespectoX(i+0.5, ancho);
            g.fillRect(interMediaI + centroX, centroY - (tamPeque/2), 1, tamPeque);
        } 
        
        for(int i = (int) Math.ceil(rangoMinY); i < rangoMaxY; i++){
            int interI = interpotarRespectoY(i, alto);
            g.fillRect(centroX - (tamMedia/2), interI + centroY , tamMedia, 1);
            
            if(i != 0)
                g.drawString(i+"", centroX + (tamMedia/2), interI +  centroY +3 );
            
            int interMediaI = interpotarRespectoY(i+0.5, alto);
            g.fillRect(centroX - (tamPeque/2), interMediaI + centroY , tamPeque, 1);
        }
        
    }
    
    /**
     * Método que dibuja sobre el lienzo los puntos obtenidos y el eje de coordenadas
     * con sus valores.
     * @param grafico
     * @param ancho
     * @param alto
     */
    @Override
    public void Draw(Graphics grafico,int ancho,int alto) {
        
        if(puntosX.isEmpty()){
            calculaPuntos(ancho, alto);
        }
        
        grafico.setColor(Color.WHITE);
        grafico.fillRect(0, 0, ancho, alto);
        
        grafico.setColor(Color.BLUE);
        
        
        for (int i = 0; i < puntosX.size(); i++){
            grafico.fillRect(puntosX.get(i), puntosY.get(i), 2, 2);
        }
        
        paintCuadricula(grafico, ancho, alto);
  
    }
    
}
