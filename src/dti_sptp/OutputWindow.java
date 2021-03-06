/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dti_sptp;

import info.monitorenter.gui.chart.Chart2D;
import info.monitorenter.gui.chart.IAxis;
import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.traces.Trace2DLtd;
import info.monitorenter.gui.chart.views.ChartPanel;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wpawgasa
 */
public class OutputWindow extends javax.swing.JFrame {

    MainWindow mw;
    /**
     * Creates new form OutputWindow
     */
    public OutputWindow(MainWindow m) {
        initComponents();
        initChart();
        initChartP();
        mw = m;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        outputTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        saveOutputBtn = new javax.swing.JButton();
        abortBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        outputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "X1 Head (mm)", "X1 Mid (mm)", "X1 Tail-8 (mm)", "X1 Tail-6 (mm)", "X1 Tail-4 (mm)", "X1 Tail-3 (mm)", "X1 Tail-2 (mm)", "X1 Tail-1 (mm)", "X1 Tail (mm)", "Pressure (PSI)", "Thrust (N)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(outputTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        saveOutputBtn.setText("Save");
        saveOutputBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveOutputBtnMouseClicked(evt);
            }
        });

        abortBtn.setText("Abort");
        abortBtn.setEnabled(false);
        abortBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abortBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(saveOutputBtn)
                .addGap(18, 18, 18)
                .addComponent(abortBtn)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveOutputBtn)
                    .addComponent(abortBtn))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abortBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abortBtnMouseClicked
        // TODO add your handling code here:
        mw.killThread();
    }//GEN-LAST:event_abortBtnMouseClicked

    private void saveOutputBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveOutputBtnMouseClicked
        // TODO add your handling code here:
        String outfilename = "GLRS.csv";
        StringBuilder out = new StringBuilder();
        out.append("Time,X1(HEAD),X1(MID),X1(TAIL-8),X1(TAIL-6),X1(TAIL-4),X1(TAIL-3),X1(TAIL-2),X1(TAIL-1),X1(TAIL),PRESSURE,THRUST");
        out.append(System.getProperty("line.separator"));
        
        DefaultTableModel table = (DefaultTableModel) outputTable.getModel();
        
        for (int i = 0; i < table.getRowCount(); i++) {
            out.append(table.getValueAt(i, 0));
            out.append(",");
            out.append(table.getValueAt(i, 1));
            out.append(",");
            out.append(table.getValueAt(i, 2));
            out.append(",");
            out.append(table.getValueAt(i, 3));
            out.append(",");
            out.append(table.getValueAt(i, 4));
            out.append(",");
            out.append(table.getValueAt(i, 5));
            out.append(",");
            out.append(table.getValueAt(i, 6));
            out.append(",");
            out.append(table.getValueAt(i, 7));
            out.append(",");
            out.append(table.getValueAt(i, 8));
            out.append(",");
            out.append(table.getValueAt(i, 9));
            out.append(",");
            out.append(table.getValueAt(i, 10));
            out.append(",");
            out.append(table.getValueAt(i, 11));
            out.append(System.getProperty("line.separator"));
        }
        
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setSelectedFile(new File(outfilename));
        int retVal = jFileChooser.showSaveDialog(jFileChooser);
         if(retVal==JFileChooser.APPROVE_OPTION) {
             try {
                File file = jFileChooser.getSelectedFile(); 
                FileOutputStream fop = new FileOutputStream(file);
                
                if (!file.exists()) {
				file.createNewFile();
			}
                
                byte[] contentInBytes = out.toString().getBytes();
 
                fop.write(contentInBytes);
                fop.flush();
                fop.close();
                
                JOptionPane.showMessageDialog(this, "Save output successfully.");
             } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } 
         } else {
             JOptionPane.showMessageDialog(this, "Error: Can't save to file");
         }
        
    }//GEN-LAST:event_saveOutputBtnMouseClicked

    private void initChart() {
            Chart2D chart = new Chart2D();
            IAxis yAxis = chart.getAxisY();
            IAxis xAxis = chart.getAxisX();
            IAxis.AxisTitle yTitle = new IAxis.AxisTitle("Thrust, N");
            yAxis.setAxisTitle(yTitle);
            IAxis.AxisTitle xTitle = new IAxis.AxisTitle("Time, s");
            xAxis.setAxisTitle(xTitle);
            xAxis.setPaintGrid(true);
            yAxis.setPaintGrid(true);
            // Create an ITrace: 
            // Note that dynamic charts need limited amount of values!!! 
            trace = new Trace2DLtd(1000); 
            trace.setColor(Color.RED);
            trace.setName("Simulated thrust profile");
            // Add the trace to the chart. This has to be done before adding points (deadlock prevention): 
            chart.addTrace(trace);
            
            trace2 = new Trace2DLtd(1000); 
            trace2.setColor(Color.BLUE);
            trace2.setName("Compared thrust profile");
            chart.addTrace(trace2);
            
            
            
    
            ChartPanel cp = new ChartPanel(chart);
            cp.setSize(748, 220);
            jPanel1.add(cp);
            
    }

    private void initChartP() {
            Chart2D chart = new Chart2D();
            IAxis yAxis = chart.getAxisY();
            IAxis xAxis = chart.getAxisX();
            IAxis.AxisTitle yTitle = new IAxis.AxisTitle("Pressure, PSI");
            yAxis.setAxisTitle(yTitle);
            IAxis.AxisTitle xTitle = new IAxis.AxisTitle("Time, s");
            xAxis.setAxisTitle(xTitle);
            xAxis.setPaintGrid(true);
            yAxis.setPaintGrid(true);
            // Create an ITrace:
            // Note that dynamic charts need limited amount of values!!!
            trace3 = new Trace2DLtd(1000);
            trace3.setColor(Color.GREEN);
            trace3.setName("Simulated pressure");
            // Add the trace to the chart. This has to be done before adding points (deadlock prevention):
            chart.addTrace(trace3);






            ChartPanel cp = new ChartPanel(chart);
            cp.setSize(748, 220);
            jPanel2.add(cp);

    }

    public ITrace2D trace;
    public ITrace2D trace2;
    public ITrace2D trace3;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton abortBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable outputTable;
    public javax.swing.JButton saveOutputBtn;
    // End of variables declaration//GEN-END:variables
}
