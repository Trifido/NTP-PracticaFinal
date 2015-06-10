/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Drawable;

import Funcion.DecoradorOperacion;
import Funcion.Funcion;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author Benjamín
 */
public class FuncionDibujable extends Funcion implements Drawable{

    int Precision;
    int rangoMinX, rangoMaxX;
    int rangoMinY, rangoMaxY;
    
    ArrayList<Double> puntos;

    public FuncionDibujable() {
        initPorDefecto();
    }

    public FuncionDibujable(DecoradorOperacion X) {
        super(X);
        initPorDefecto();
    }
    
    private void initPorDefecto(){
        Precision = 1000000;
        rangoMaxX = 10;
        rangoMinX = -10;
        
        rangoMaxY = 10;
        rangoMinY = -10;
        
    }

    public int getPrecision() {
        return Precision;
    }

    public void setPrecision(int Precision) {
        this.Precision = Precision;
    }

    public int getRangoMinX() {
        return rangoMinX;
    }

    public void setRangoMinX(int rangoMinX) {
        this.rangoMinX = rangoMinX;
    }

    public int getRangoMaxX() {
        return rangoMaxX;
    }

    public void setRangoMaxX(int rangoMaxX) {
        this.rangoMaxX = rangoMaxX;
    }

    public int getRangoMinY() {
        return rangoMinY;
    }

    public void setRangoMinY(int rangoMinY) {
        this.rangoMinY = rangoMinY;
    }

    public int getRangoMaxY() {
        return rangoMaxY;
    }

    public void setRangoMaxY(int rangoMaxY) {
        this.rangoMaxY = rangoMaxY;
    }
    
    
    
    
    
    @Override
    public void Draw(Canvas lienzo) {
        Graphics2D grafico = (Graphics2D) lienzo.getGraphics();
        grafico.setColor(Color.BLUE);
        /**
         * falta calcular los puntos y recorrerlos para ir pintandolos. 
         */
        grafico.drawRect(100, 100, 1, 1);
    }
    
}
