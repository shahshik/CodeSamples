/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReportPublisherRole;

import Business.Device.Device;
import Business.Enterprise.Enterprise;
import Business.Organization.ReportingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NARESH SHAH
 */
public class HealthAnalystReportJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private ReportingOrganization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private WorkRequest request;
    private String HTMLMessage;
    
    /**
     * Creates new form HealthAnalystJPanel
     */
    public HealthAnalystReportJPanel(JPanel userProcessContainer,UserAccount account,ReportingOrganization organization,Enterprise enterprise,WorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
        this.request = request;
        valueLabel.setText(enterprise.getName());
        txtRequestId.setText(String.valueOf(request.getRequestId()));
        
        populateDeviceTable1();
        
    }
    
    public void populateDeviceTable1(){
        DefaultTableModel model = (DefaultTableModel) tblDeviceDetailsForHealth.getModel();
        
        model.setRowCount(0);
    if(organization.getDeviceDirectory() != null){
        for(Device d : organization.getDeviceDirectory().getDeviceList()){
             
                 
            Object row[] = new Object[6];
            row[0] = d.getIMEINo();
            //row[1] = d.getModelNo();
            //row[2] = d.getCallEndTime();
            row[1] = d.getAvgSAR();
            row[2] = d.getMaxSAR();
            row[3] = d.getValueRF();
            row[4] = d.getCallEndTime();
            model.addRow(row);
         }
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

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeviceDetailsForHealth = new javax.swing.JTable();
        btnHealth = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRequestId = new javax.swing.JTextField();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        tblDeviceDetailsForHealth.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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
        jScrollPane1.setViewportView(tblDeviceDetailsForHealth);
        if (tblDeviceDetailsForHealth.getColumnModel().getColumnCount() > 0) {
            tblDeviceDetailsForHealth.getColumnModel().getColumn(0).setResizable(false);
            tblDeviceDetailsForHealth.getColumnModel().getColumn(1).setResizable(false);
            tblDeviceDetailsForHealth.getColumnModel().getColumn(2).setResizable(false);
            tblDeviceDetailsForHealth.getColumnModel().getColumn(3).setResizable(false);
            tblDeviceDetailsForHealth.getColumnModel().getColumn(4).setResizable(false);
        }

        btnHealth.setText("Send Report");
        btnHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealthActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Request Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRequestId, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(72, 72, 72)
                .addComponent(btnHealth)
                .addGap(127, 127, 127))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRequestId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHealth)
                    .addComponent(btnBack))
                .addGap(52, 52, 52))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
       
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealthActionPerformed
        // TODO add your handling code here:
        
        
        request.setStatus("Completed");
        
        HTMLMessage="<table border='1'>";
        HTMLMessage=HTMLMessage+"<tr><th>IMEINO.</th><th>AverageSAR.</th><th>MaxSAR.</th><th>RFExposure</th><th>MobileUsage</th></tr>";
        for(int i=0;i<tblDeviceDetailsForHealth.getRowCount();i++)
        {
            HTMLMessage=HTMLMessage+"<tr><td>"+tblDeviceDetailsForHealth.getValueAt(i,0) + "</td>";
            HTMLMessage=HTMLMessage+"<td>"+tblDeviceDetailsForHealth.getValueAt(i,1) + "</td>";
            HTMLMessage=HTMLMessage+"<td>"+tblDeviceDetailsForHealth.getValueAt(i,2) + "</td>";
            HTMLMessage=HTMLMessage+"<td>"+tblDeviceDetailsForHealth.getValueAt(i,3) + "</td>";
            HTMLMessage=HTMLMessage+"<td>"+tblDeviceDetailsForHealth.getValueAt(i,4) + "</td></tr>";
        }
        HTMLMessage=HTMLMessage+"</table>";
        
        //JOptionPane.showMessageDialog(null,"Report Send to Health Organization Successfully");
        HealthReportByMailJPanel hrmjp = new HealthReportByMailJPanel(userProcessContainer,account, organization, enterprise,request,HTMLMessage);
        userProcessContainer.add("HealthAnalystReportJPanel1", hrmjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
        //JOptionPane.showMessageDialog(null,"Report Send to Health Organization Successfully");
    }//GEN-LAST:event_btnHealthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHealth;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeviceDetailsForHealth;
    private javax.swing.JTextField txtRequestId;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}