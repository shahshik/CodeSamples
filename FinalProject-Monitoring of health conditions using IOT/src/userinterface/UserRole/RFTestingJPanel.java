/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRole;

import Business.Device.Device;
import Business.Device.DeviceDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Utils.MyIMEINumberVerifier;
import Business.Utils.MyPhoneNumberVerifier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author NARESH SHAH
 */
public class RFTestingJPanel extends javax.swing.JPanel {
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount account;
    
    private JPanel userProcessContainer;
    private int random3;
    
    /**
     * Creates new form RFTestingJPanel
     */
    public RFTestingJPanel(JPanel userProcessContainer,UserAccount account,Organization organization, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.organization = organization;
        this.account = account;
        MyPhoneNumberVerifier myPhoneNumberVerifier= new MyPhoneNumberVerifier();
        txtSearch.setInputVerifier(myPhoneNumberVerifier);
        this.userProcessContainer = userProcessContainer;
        populateClearFields();
    }
    
    private void populateClearFields(){
        
        txtAvgSAR.setText("");
        txtEndTime.setText("");
        txtMaxSAR.setText("");
        txtRF.setText("");
        txtSearch.setText("");
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
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAvgSAR = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaxSAR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRF = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEndTime = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("RF Testing");

        btnSearch.setText("Search By Mobile Number");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Average SAR");

        txtAvgSAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvgSARActionPerformed(evt);
            }
        });

        jLabel3.setText("Maximum SAR");

        jLabel4.setText("RF Frequency Range(MHz)");

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setText("Call Duration(in minutes):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheck)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEndTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(txtRF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaxSAR, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAvgSAR, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAvgSAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaxSAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck)
                    .addComponent(btnBack))
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAvgSARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvgSARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvgSARActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String key = txtSearch.getText();
        if (key == null || txtSearch.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please provide Mobile Number to search", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Device result = organization.getDeviceDirectory().searchDevice(key);

            if (result != null) {
               double random1 = (int)(Math.random()*2)+0.2;
               double random2 = (int)(Math.random()*0.5)+1.5;
               random3 = (int)(Math.random()* 260 ) + 20;
               //double random4 = (int)(Math.random()*60)+0;
               double random5 = (int)(Math.random()*60)+5;
               for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
               Device d = org.getDeviceDirectory().searchDevice(key);
               result.setAvgSAR(random1);
               d.setAvgSAR(random1);
               d.setMaxSAR(random2);
               result.setMaxSAR(random2);
               result.setValueRF(random3);
               d.setValueRF(random3);
               //d.setCallStartTime(random4);
               result.setCallEndTime(random5);
               d.setCallEndTime(random5);
               txtAvgSAR.setText(String.valueOf(result.getAvgSAR()));
               txtMaxSAR.setText(String.valueOf(result.getMaxSAR()));
               txtRF.setText(String.valueOf(result.getValueRF()));
               //txtStartTime.setText(String.valueOf(d.getCallStartTime()));
               txtEndTime.setText(String.valueOf(result.getCallEndTime()));
               }
               
               JOptionPane.showMessageDialog(null, "Random Number Generated");
               
               
              
               
         } else {
                JOptionPane.showMessageDialog(null, "Phone Number to search dosen't exist in the records.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        
        if(txtRF.getText().trim().length() > 0){
        if(random3 >30 && random3 <300){
           // populateClearFields();
        ProtectiveMeasuresJPanel pmjp4 = new ProtectiveMeasuresJPanel(userProcessContainer,account, organization, enterprise);
        userProcessContainer.add("protectiveMeasuresJPanel4", pmjp4);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        JOptionPane.showMessageDialog(null,"Maximum Permissable Level Reached and Select One of the Protective Measures","Warning",JOptionPane.WARNING_MESSAGE);
          //populateClearFields();
          }
        }
        else{
            JOptionPane.showMessageDialog(null,"RF Number Not Available");
        }
      
        populateClearFields();
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //populateClearFields();
        userProcessContainer.remove(this);
       
        //Component[] componentArray = userProcessContainer.getComponents();
        //Component component = componentArray[componentArray.length - 1];
        //UserWorkAreaJPanel uwjp1 = (UserWorkAreaJPanel) component;
        //uwjp1.populateDeviceTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAvgSAR;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtMaxSAR;
    private javax.swing.JTextField txtRF;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
