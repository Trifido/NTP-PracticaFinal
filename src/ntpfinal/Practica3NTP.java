/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ntpfinal;

import Drawable.FuncionDibujable;
import Estrategias.Algoritmo;
import Estrategias.EstrategiaStore;
import Funcion.Funcion;
import Funcion.FuncionStore;
import Observador.Buscador;
import Observador.EstadoBusqueda;
import Observador.Observable;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;

/**
 *
 * @author Benjamín y Vicente
 */
public class Practica3NTP extends javax.swing.JFrame {

    /**
     * Creates new form Practica3NTP
     */
    FuncionDibujable fDibujable;
    Funcion f;
    
    Observable estado;
    Buscador buscador1;
    Buscador buscador2;
    Buscador buscador3;
    ArrayList<Algoritmo> algoritmos;
    
    public Practica3NTP() {
        initComponents();
        
        setLocationRelativeTo(null);
        parametros.setLocationRelativeTo(null);
        
        parametros.setVisible(true);
        
        fDibujable = new FuncionDibujable();
        
        //Inicializamos el Observable y los observadores.
        estado= EstadoBusqueda.getInstance();
        buscador1= new Buscador(1);
        buscador2= new Buscador(2);
        buscador3= new Buscador(0);
        
        buscador1.setTextCampo(TexEstrategiaB1);
        buscador2.setTextCampo(TexEstrategiaB2);
        buscador3.setTextCampo(TexEstrategiaB3);
        
        estado.addObservador(buscador1);
        estado.addObservador(buscador2);
        estado.addObservador(buscador3);
        ((EstadoBusqueda)estado).setTextMax(TexMaxEncontrado);
        
        //Añadimos los algoritmos
        algoritmos= new ArrayList();
        //cambiarRangos(-10.0,10.0);
        
    }
    
    public void lanzarEjecucion(){
        buscador1.setFuncion(new Funcion(f));
        buscador2.setFuncion(new Funcion(f));
        buscador3.setFuncion(new Funcion(f));
        
        //Creamos un contenedor de hebras y ejecutamos las hebras buscadoras
        ExecutorService executor= Executors.newFixedThreadPool(3);
        executor.execute(buscador1);
        executor.execute(buscador2);
        executor.execute(buscador3);
    }
    
    public void cambiarRangos(double min, double max){
        algoritmos.clear();
        
        EstrategiaStore factoria= new EstrategiaStore();
        algoritmos.add(new Algoritmo(factoria.orderEstrategia("simple")));
        algoritmos.add(new Algoritmo(factoria.orderEstrategia("multiple")));
        algoritmos.add(new Algoritmo(factoria.orderEstrategia("recocido")));
        
        algoritmos.get(0).addRange(min, max);
        algoritmos.get(1).addRange(min, max);
        algoritmos.get(2).addRange(min, max);
        
        buscador1.setAlgoritmo(algoritmos);
        buscador2.setAlgoritmo(algoritmos);
        buscador3.setAlgoritmo(algoritmos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parametros = new javax.swing.JFrame();
        siguiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        xMin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        xMax = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        yMin = new javax.swing.JTextField();
        yMax = new javax.swing.JTextField();
        funciones = new javax.swing.JComboBox();
        Monitor = new javax.swing.JFrame();
        jLabel12 = new javax.swing.JLabel();
        TexEstrategiaB1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TextFunc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TexMaxEncontrado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TexEstrategiaB2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TexEstrategiaB3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelFuncion = new javax.swing.JLabel();
        lienzo = new Drawable.Lienzo();
        jLabel6 = new javax.swing.JLabel();
        xMinima = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        xMaxima = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        yMinima = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        yMaxima = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Cambio = new javax.swing.JButton();

        parametros.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        parametros.setMaximumSize(new java.awt.Dimension(250, 200));
        parametros.setMinimumSize(new java.awt.Dimension(250, 200));
        parametros.setPreferredSize(new java.awt.Dimension(250, 200));
        parametros.setResizable(false);

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Rango Mínimo de X:");

        xMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMinActionPerformed(evt);
            }
        });

        jLabel3.setText("Rango Máximo de X:");

        xMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMaxActionPerformed(evt);
            }
        });

        jLabel4.setText("Rango Mínimo de Y:");

        jLabel5.setText("Rango Máximo de Y:");

        yMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMinActionPerformed(evt);
            }
        });

        yMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMaxActionPerformed(evt);
            }
        });

        funciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin(X)", "Cos(X)", "-2x / (x^2 -1)^2", "21,5 + X * Sin(4*PI*X) + Y * Sin(20*PI*Y)", "21,5 + X * Cos(4*PI*X) + Y * Cos(20*PI*Y)" }));

        javax.swing.GroupLayout parametrosLayout = new javax.swing.GroupLayout(parametros.getContentPane());
        parametros.getContentPane().setLayout(parametrosLayout);
        parametrosLayout.setHorizontalGroup(
            parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parametrosLayout.createSequentialGroup()
                        .addComponent(funciones, 0, 147, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siguiente))
                    .addGroup(parametrosLayout.createSequentialGroup()
                        .addGroup(parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(yMin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xMin, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xMax)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yMax))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        parametrosLayout.setVerticalGroup(
            parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(funciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Monitor.setMaximumSize(new java.awt.Dimension(400, 370));
        Monitor.setMinimumSize(new java.awt.Dimension(400, 370));
        Monitor.setPreferredSize(new java.awt.Dimension(400, 370));
        Monitor.setResizable(false);

        jLabel12.setText("Función:");

        TexEstrategiaB1.setEditable(false);
        TexEstrategiaB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexEstrategiaB1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Máximo encontrado:");

        TextFunc.setEditable(false);
        TextFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFuncActionPerformed(evt);
            }
        });

        jLabel15.setText("Estrategia B1:");

        TexMaxEncontrado.setEditable(false);
        TexMaxEncontrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexMaxEncontradoActionPerformed(evt);
            }
        });

        jLabel16.setText("Estrategia B2:");

        TexEstrategiaB2.setEditable(false);
        TexEstrategiaB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexEstrategiaB2ActionPerformed(evt);
            }
        });

        jLabel17.setText("Estrategia B3:");

        TexEstrategiaB3.setEditable(false);
        TexEstrategiaB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexEstrategiaB3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MonitorLayout = new javax.swing.GroupLayout(Monitor.getContentPane());
        Monitor.getContentPane().setLayout(MonitorLayout);
        MonitorLayout.setHorizontalGroup(
            MonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonitorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TexEstrategiaB1)
                    .addComponent(TextFunc)
                    .addComponent(TexMaxEncontrado)
                    .addComponent(TexEstrategiaB2)
                    .addGroup(MonitorLayout.createSequentialGroup()
                        .addGroup(MonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(0, 171, Short.MAX_VALUE))
                    .addComponent(TexEstrategiaB3))
                .addContainerGap())
        );
        MonitorLayout.setVerticalGroup(
            MonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(TextFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(TexMaxEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TexEstrategiaB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TexEstrategiaB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TexEstrategiaB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(655, 522));
        setResizable(false);

        jLabel1.setText("Funcion:");

        LabelFuncion.setText("<Aquí se verá la función>");

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jLabel6.setText("X[");

        xMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMinimaActionPerformed(evt);
            }
        });

        jLabel7.setText(",");

        xMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMaximaActionPerformed(evt);
            }
        });

        jLabel8.setText("]");

        jLabel9.setText("Y[");

        yMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMinimaActionPerformed(evt);
            }
        });

        jLabel10.setText(",");

        yMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMaximaActionPerformed(evt);
            }
        });

        jLabel11.setText("]");

        Cambio.setText("Cambiar Rangos");
        Cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Cambio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(yMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(xMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(xMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(yMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(xMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(xMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(yMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(yMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        try{
            double rangoMin = Double.parseDouble(xMin.getText());
            double rangoMax = Double.parseDouble(xMax.getText());
            
            FuncionStore factoria = new FuncionStore();
            f= factoria.orderFuncion(funciones.getSelectedIndex());
            fDibujable = new FuncionDibujable(factoria.orderFuncion(funciones.getSelectedIndex()));
            
            fDibujable.setRangoX(rangoMin, rangoMax);
            
            rangoMin = Double.parseDouble(yMin.getText());
            rangoMax = Double.parseDouble(yMax.getText());
            fDibujable.setRangoY(rangoMin, rangoMax);
            
            fDibujable.Draw(lienzo.getGraphics(), lienzo.getWidth(), lienzo.getHeight());
            
            xMinima.setText(fDibujable.getRangoMinX()+"");
            xMaxima.setText(fDibujable.getRangoMaxX()+"");
            
            yMinima.setText(fDibujable.getRangoMinY()+"");
            yMaxima.setText(fDibujable.getRangoMaxY()+"");
            
            lienzo.setF(fDibujable);
         
            LabelFuncion.setText(fDibujable.toString());
            TextFunc.setText(f.toString());
            
            cambiarRangos(rangoMin,rangoMax);
            lanzarEjecucion();
            parametros.setVisible(false);
            Monitor.setVisible(true);
            this.setVisible(true);
            
        }catch(NumberFormatException e){
            xMin.requestFocus();
            JOptionPane.showMessageDialog(this, "Debes de introducir valores numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void xMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMinActionPerformed
        xMax.requestFocus();
    }//GEN-LAST:event_xMinActionPerformed

    private void xMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMaxActionPerformed
        yMin.requestFocus();
    }//GEN-LAST:event_xMaxActionPerformed

    private void yMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMinActionPerformed
        yMax.requestFocus();
    }//GEN-LAST:event_yMinActionPerformed

    private void yMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMaxActionPerformed
        siguienteActionPerformed(evt);
    }//GEN-LAST:event_yMaxActionPerformed

    private void xMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMinimaActionPerformed
        try{
            double rangoMin = Double.parseDouble(xMinima.getText());
            double rangoMax = Double.parseDouble(xMaxima.getText());
            
            fDibujable.setRangoX(rangoMin, rangoMax);
            
            rangoMin = Double.parseDouble(yMinima.getText());
            rangoMax = Double.parseDouble(yMaxima.getText());
            
            fDibujable.setRangoY(rangoMin, rangoMax);
            
            xMinima.setText(fDibujable.getRangoMinX()+"");
            xMaxima.setText(fDibujable.getRangoMaxX()+"");
            yMinima.setText(fDibujable.getRangoMinY()+"");
            yMaxima.setText(fDibujable.getRangoMaxY()+"");
            
            cambiarRangos(rangoMin,rangoMax);
            
            //f.Draw(lienzo.getGraphics(), lienzo.getWidth(), lienzo.getHeight());
            lienzo.repaint();
        }catch(NumberFormatException e){
            xMinima.setText(fDibujable.getRangoMinX()+"");
            xMaxima.setText(fDibujable.getRangoMaxX()+"");
            yMinima.setText(fDibujable.getRangoMinY()+"");
            yMaxima.setText(fDibujable.getRangoMaxY()+"");
        }
    }//GEN-LAST:event_xMinimaActionPerformed

    private void xMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMaximaActionPerformed
        xMinimaActionPerformed(evt);
    }//GEN-LAST:event_xMaximaActionPerformed

    private void yMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMinimaActionPerformed
        xMinimaActionPerformed(evt);
    }//GEN-LAST:event_yMinimaActionPerformed

    private void yMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMaximaActionPerformed
        yMinimaActionPerformed(evt);
    }//GEN-LAST:event_yMaximaActionPerformed

    private void CambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioActionPerformed
        xMaximaActionPerformed(evt);
    }//GEN-LAST:event_CambioActionPerformed

    private void TexEstrategiaB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexEstrategiaB1ActionPerformed
        
    }//GEN-LAST:event_TexEstrategiaB1ActionPerformed

    private void TextFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFuncActionPerformed
        TextFunc.setText(f.toString());
    }//GEN-LAST:event_TextFuncActionPerformed

    private void TexMaxEncontradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexMaxEncontradoActionPerformed
        TexMaxEncontrado.setText(estado.toString());
    }//GEN-LAST:event_TexMaxEncontradoActionPerformed

    private void TexEstrategiaB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexEstrategiaB2ActionPerformed
        TexEstrategiaB2.setText(buscador2.toString());
    }//GEN-LAST:event_TexEstrategiaB2ActionPerformed

    private void TexEstrategiaB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexEstrategiaB3ActionPerformed
        TexEstrategiaB3.setText(buscador3.toString());
    }//GEN-LAST:event_TexEstrategiaB3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practica3NTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica3NTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica3NTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica3NTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica3NTP().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambio;
    private javax.swing.JLabel LabelFuncion;
    private javax.swing.JFrame Monitor;
    private javax.swing.JTextField TexEstrategiaB1;
    private javax.swing.JTextField TexEstrategiaB2;
    private javax.swing.JTextField TexEstrategiaB3;
    private javax.swing.JTextField TexMaxEncontrado;
    private javax.swing.JTextField TextFunc;
    private javax.swing.JComboBox funciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private Drawable.Lienzo lienzo;
    private javax.swing.JFrame parametros;
    private javax.swing.JButton siguiente;
    private javax.swing.JTextField xMax;
    private javax.swing.JTextField xMaxima;
    private javax.swing.JTextField xMin;
    private javax.swing.JTextField xMinima;
    private javax.swing.JTextField yMax;
    private javax.swing.JTextField yMaxima;
    private javax.swing.JTextField yMin;
    private javax.swing.JTextField yMinima;
    // End of variables declaration//GEN-END:variables
}
