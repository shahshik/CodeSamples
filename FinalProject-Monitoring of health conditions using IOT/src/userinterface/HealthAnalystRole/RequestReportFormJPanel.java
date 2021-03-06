/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthAnalystRole;

import Business.Enterprise.Enterprise;
import Business.GmailClient.GmailClient;
import Business.Organization.HealthOrganization;
import Business.Organization.Organization;
import Business.Organization.ReportingOrganization;
import Business.UserAccount.UserAccount;
import Business.Utils.MyEmailVerifier;
import Business.WorkQueue.HealthReportWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author NARESH SHAH
 */
public class RequestReportFormJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HealthOrganization organization;
    /**
     * Creates new form RequestReportJPanel
     */
    public RequestReportFormJPanel(JPanel userProcessContainer,UserAccount userAccount,HealthOrganization organization,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = organization;
        MyEmailVerifier myEmailVerifier= new MyEmailVerifier();
        txtEmailId.setInputVerifier(myEmailVerifier);
        //valueLabel.setText(enterprise.getName());
       // txtEmailId.setEnabled(false);
        //txtMailMessage.setEnabled(false);
        //txtSub.setEnabled(false);
        //txtAddress.setEnabled(false);
        //requestTestJButton.setEnabled(false);
        //populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbRequest = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtSub = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMailMessage = new javax.swing.JTextArea();

        requestTestJButton.setText("Request Report");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel5.setText("Mode of Sending Request");

        cmbRequest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Please Select Mode:", "Email", "Courier", "Post", "Hand to Hand" }));
        cmbRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRequestActionPerformed(evt);
            }
        });

        jLabel1.setText("Address");

        jLabel2.setText("Receiver's Email Id:");

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel3.setText("Subject");

        jLabel6.setText("Mail Message");

        txtMailMessage.setColumns(20);
        txtMailMessage.setRows(5);
        jScrollPane3.setViewportView(txtMailMessage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(backJButton)
                    .addGap(64, 64, 64)
                    .addComponent(requestTestJButton))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(283, 283, 283))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addGap(23, 23, 23)
                    .addComponent(cmbRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(95, 95, 95)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(406, 406, 406))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestTestJButton)
                    .addComponent(backJButton))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
       
        String message = (String)cmbRequest.getSelectedItem();
        if(message.equalsIgnoreCase("Please Select Mode:")){
             JOptionPane.showMessageDialog(null, "Please Select The Mode Of Sending");
             return;
        }
        else if(message.equalsIgnoreCase("Courier") || message.equalsIgnoreCase("Post") || message.equalsIgnoreCase("Hand to Hand"))
        {
        }
        else{

            if(txtEmailId.getText().isEmpty() )
            {   JOptionPane.showMessageDialog(null, "Please Provide Email Id of Receiver");
                return;
            }
            if(txtMailMessage.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(null, "Please Provide Mail Message For Receiver");
                return; 
            }
            if(txtSub.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(null, "Please Provide Subject For Receiver");
                return; 
            }
            String mailFrom=new String("shikha001688235@gmail.com");
 
            //Sender must be a Gmail Account holder
 
            String mailTo=txtEmailId.getText();
            //but here you can send to any type of mail account
 
            String senderPassword=new String("001688235");
 
            String senderUserName=new String("shikha001688235@gmail.com");
            Boolean isHtml=false;
            //if mail send as html then ishmtl=true else ishtml=false
 
            //Mention your email subject and content
 
            String mailSubject=txtSub.getText();
 
            String mailText=txtMailMessage.getText();
            //String mailText=HtmlMessage;
 
            //Create a GmailClient object
 
            GmailClient newGmailClient=new GmailClient();
 
            //Setting up account details
 
            newGmailClient.setAccountDetails(senderUserName, senderPassword);
 
            //Send mail
 
            newGmailClient.sendGmail(mailFrom, mailTo, mailSubject, mailText,isHtml);
 
            //Receive mails
 
            //.readGmail();
        }
        HealthReportWorkRequest request = new HealthReportWorkRequest();
        request.setModeOfreceive(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setOrganizationType("Health");
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
        {   if (organization instanceof HealthOrganization){
                org = organization;
                break;
            }
        }
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ReportingOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null, "Details Added Successfully And Request Sent");

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HealthAnalystWorkAreaJPanel hawjp = (HealthAnalystWorkAreaJPanel) component;
        hawjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void cmbRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRequestActionPerformed
        // TODO add your handling code here:
               String message = (String)cmbRequest.getSelectedItem();
        if(message.equalsIgnoreCase("Please Select Mode:")){
             JOptionPane.showMessageDialog(null, "Please Select The Mode Of Sending");
             return;
        }
        else if(message.equalsIgnoreCase("Courier") || message.equalsIgnoreCase("Post") || message.equalsIgnoreCase("Hand to Hand"))
        {   txtAddress.setEnabled(true);
            txtEmailId.setEnabled(false);
            txtSub.setEnabled(false);
            txtMailMessage.setEnabled(false);
            
        }
        else{
            txtAddress.setEnabled(false);
            txtEmailId.setEnabled(true);
            txtSub.setEnabled(true);
            txtMailMessage.setEnabled(true);
            
        }
    }//GEN-LAST:event_cmbRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cmbRequest;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextArea txtMailMessage;
    private javax.swing.JTextField txtSub;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
