/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthAnalystRole;

import Business.Device.Device;
import Business.EffectsOnBody.EffectsOnBody;
import Business.EffectsOnBody.EffectsOnBodyList;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author NARESH SHAH
 */
public class ViewReportJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private HealthOrganization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private Device device;
    /**
     * Creates new form ViewReportJPanel
     */
    public ViewReportJPanel(JPanel userProcessContainer, UserAccount account, HealthOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.account = account;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        populateTable();
        btnAdd.setEnabled(false);
    }
    
    public void populateTable(){
        //DefaultTableModel model = (DefaultTableModel) tblHealthTable.getModel();
        
        //model.setRowCount(0);
    if(organization.getDeviceDirectory() != null){
        DefaultTableModel model = (DefaultTableModel) tblHealthTable.getModel();
        
        model.setRowCount(0);
        for(Device d : organization.getDeviceDirectory().getDeviceList()){
                //if(d.getEffectsOnBodyList().getEffectsOnBodyList().isEmpty()) {
                 
            Object row[] = new Object[7];
            row[0] = d;
            //row[1] = d.getModelNo();
            //row[2] = d.getCallEndTime();
            row[1] = d.getAvgSAR();
            row[2] = d.getMaxSAR();
            row[3] = d.getValueRF();
            row[4] = d.getCallEndTime();
            //row[5] = "";
            //row[6] = "";
            model.addRow(row);
           }
        } else{
        JOptionPane.showMessageDialog(null,"No Device Found");
    }
    }    
         /*}else{  
                 value1.setText(d.getIMEINo());
                 DefaultTableModel mod = (DefaultTableModel) tblBodyEffects.getModel();
                 mod.setRowCount(0);
                 for(EffectsOnBody b :d.getEffectsOnBodyList().getEffectsOnBodyList()){
                   Object row[] = new Object[3];
                          row[0] = b;
                          row[1] = b.getDiseaseType();
            //row[1] = d.getModelNo();
            //row[2] = d.getCallEndTime();
                        // row[1] = d.getAvgSAR();
                        // row[2] = d.getMaxSAR();
                        //row[3] = d.getValueRF();
                        //row[4] = d.getCallEndTime();
                        // row[5] = b.getEffectsOnOrgans();
                        // row[6] = b.getDiseaseType();
                         mod.addRow(row);  
                         //populateEffectsonBodyTable();
                 }
             }
        
        }
        
   }   
} */
    
    public void populateEffectsonBodyTable(Device d){
         //device = (Device) tblHealthTable.getValueAt(selectedRow, 0);
            //tblHealthTable.setValueAt(device,selectedRow,0);
        value1.setText(d.getIMEINo());
                 DefaultTableModel mod = (DefaultTableModel) tblBodyEffects.getModel();
                 mod.setRowCount(0);
                 for(EffectsOnBody b :d.getEffectsOnBodyList().getEffectsOnBodyList()){
                   Object row[] = new Object[3];
                          row[0] = b;
                          row[1] = b.getDiseaseType();
            //row[1] = d.getModelNo();
            //row[2] = d.getCallEndTime();
                        // row[1] = d.getAvgSAR();
                        // row[2] = d.getMaxSAR();
                        //row[3] = d.getValueRF();
                        //row[4] = d.getCallEndTime();
                        // row[5] = b.getEffectsOnOrgans();
                        // row[6] = b.getDiseaseType();
                         mod.addRow(row);  
                }
                 
    }         
            
            
            
            
            
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHealthTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOrgan = new javax.swing.JTextField();
        txtDisease = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBodyEffects = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        value1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Health Reports");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        tblHealthTable.setAutoCreateRowSorter(true);
        tblHealthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IMEI Number", "Average SAR Value", "Max SAR Value", "RF Exposure", "Mobile Usage(in mins)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHealthTable);

        jLabel2.setText("Organs/Body Parts Affected");

        jLabel3.setText("Most Likely Disease which can Occur");

        txtDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiseaseActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Health Analyst Work Area");

        jButton2.setText("Add Doctor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblBodyEffects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organs Effected", "Disease(Most Likely)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblBodyEffects);
        if (tblBodyEffects.getColumnModel().getColumnCount() > 0) {
            tblBodyEffects.getColumnModel().getColumn(0).setResizable(false);
            tblBodyEffects.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel5.setText("IMEI No:");

        value1.setText("<value>");

        jButton3.setText("Populate Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOrgan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addGap(30, 30, 30)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(28, 28, 28)
                                                    .addComponent(value1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(36, 36, 36)
                                                    .addComponent(jButton2)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142)
                                        .addComponent(jButton3)))))
                        .addGap(422, 422, 422)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOrgan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(value1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiseaseActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblHealthTable.getSelectedRow();
        
        /*if (selectedRow < 0){
            
            JOptionPane.showMessageDialog(null, "Please Select A Row");
            return;
        }else{
            Device d = (Device) tblHealthTable.getValueAt(selectedRow, 0);
            populateEffectsonBodyTable(d);
        }*/
       
        //device = (Device) tblHealthTable.getValueAt(selectedRow, 0);
       
        
        
            String organ = txtOrgan.getText();
            String disease = txtDisease.getText();
             if(((txtDisease.getText().trim().length()) ==0 || (txtOrgan.getText().trim().length()==0))){ 
            JOptionPane.showMessageDialog(null, "Please enter the details");
            btnAdd.setEnabled(true);
        }else{
         for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){        
            for(Device d : organization.getDeviceDirectory().getDeviceList()){   
               EffectsOnBody effects = d.getEffectsOnBodyList().addEffects();
                
                effects.setEffectsOnOrgans(organ);
                effects.setDiseaseType(disease);
                //tblHealthTable.setValueAt(device,selectedRow,0);
                
               }
         } 
         
            //device = (Device) tblHealthTable.getValueAt(selectedRow, 0);
            //tblHealthTable.setValueAt(device,selectedRow,0);
        
         btnAdd.setEnabled(false);
         Device d = (Device) tblHealthTable.getValueAt(selectedRow, 0);
         populateEffectsonBodyTable(d);
    }
          //populateTable();
          
          txtDisease.setText("");
          txtOrgan.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HealthAnalystWorkAreaJPanel hawjp = (HealthAnalystWorkAreaJPanel) component;
        hawjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed
    private void createChart()
    {
        DefaultCategoryDataset healthDataset=new DefaultCategoryDataset();
        int selectedRow = tblHealthTable.getSelectedRow();
        Device effects = (Device) tblHealthTable.getValueAt(selectedRow, 0);
        //Device device= device.getEffectsOnBodyList().getEffectsOnBodyList().;
        
        for(Device d : organization.getDeviceDirectory().getDeviceList()){
             if(d.getEffectsOnBodyList().getEffectsOnBodyList().isEmpty() || d.getEffectsOnBodyList().getEffectsOnBodyList().size() ==1)
        {
            JOptionPane.showMessageDialog(this, "No body organs or only one body organ affected found. At least 2 organs effected records needed to show chart!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
                 Double organ = Double.parseDouble(txtOrgan.getText());
                 Double value = d.getMaxSAR();
             }
     }
        //ArrayList<EffectsOnBody> effectsOnBodyList = device.getEffectsOnBodyList().getEffectsOnBodyList();
        
        /*if (effectsOnBodyList.isEmpty() || effectsOnBodyList.size() == 1) {
            JOptionPane.showMessageDialog(this, "No body organs or only one body organ affected found. At least 2 organs effected records needed to show chart!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }*/
        Double organ = Double.parseDouble(txtOrgan.getText());
        for (Device device : organization.getDeviceDirectory().getDeviceList()) {
             for(EffectsOnBody b1 :device.getEffectsOnBodyList().getEffectsOnBodyList()){
                 Double value = device.getMaxSAR();
            
            //healthDataset.addValue(vitalSign.getHeartRate(),"Most Likely Diseases", device.getMaxSAR());
            //vitalSignDataset.addValue(vitalSign.getBloodPressure(),"BP", vitalSign.getTimestamp());
            //vitalSignDataset.addValue(vitalSign.getWeight(),"WT", vitalSign.getTimestamp());
            }
        
        }
        
        JFreeChart healthSignChart= ChartFactory.createBarChart3D("Effects On Health Chart", "Time Stamp", "Rate", healthDataset, PlotOrientation.VERTICAL, true, false, false);
        healthSignChart.setBackgroundPaint(Color.white);
        CategoryPlot vitalSignChartPlot = healthSignChart.getCategoryPlot();
        vitalSignChartPlot.setBackgroundPaint(Color.lightGray);    
        
        CategoryAxis vitalSignDomainAxis = vitalSignChartPlot.getDomainAxis();
        vitalSignDomainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        
        NumberAxis vitalSignRangeAxis = (NumberAxis) vitalSignChartPlot.getRangeAxis();
        vitalSignRangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        ChartFrame chartFrame = new ChartFrame("Chart", healthSignChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(500, 500);

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        ManageDoctorJPanel mdjp = new ManageDoctorJPanel(userProcessContainer,organization);
        userProcessContainer.add("ViewReportJPanel10", mdjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblHealthTable.getSelectedRow();
        
        if (selectedRow < 0){
            
            JOptionPane.showMessageDialog(null, "Please Select A Row");
            return;
        }else{
            Device d = (Device)tblHealthTable.getValueAt(selectedRow, 0);
            btnAdd.setEnabled(true);
            populateEffectsonBodyTable(d);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBodyEffects;
    private javax.swing.JTable tblHealthTable;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtOrgan;
    private javax.swing.JLabel value1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
