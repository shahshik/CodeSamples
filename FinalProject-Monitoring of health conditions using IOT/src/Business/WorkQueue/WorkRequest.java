/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Device.DeviceDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author NARESH SHAH
 */
public abstract class WorkRequest {
    
    private int requestId;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String modeOfreceive;
    private String organizationType;
    private String receiverAdd;
    private String receiverEmail;
    private String emailMessage;
    private String emailSubject;
    private DeviceDirectory deviceList;
    //private static int counter;
    public WorkRequest(){
        requestDate = new Date();
       // requestId = counter;
        //counter++;
        requestId = generateRandomNumbers();
    }

    public String getEmailMessage() {
        return emailMessage;
    }

    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }
    
    
    public String getModeOfreceive() {
        return modeOfreceive;
    }

    public void setModeOfreceive(String modeOfreceive) {
        this.modeOfreceive = modeOfreceive;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int i) {
        this.requestId = i;
    }
    
    
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

   public static int generateRandomNumbers(){
       ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<15; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        
           return list.get(0);
    }

    public String getReceiverAdd() {
        return receiverAdd;
    }

    public void setReceiverAdd(String receiverAdd) {
        this.receiverAdd = receiverAdd;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }
    
    

    

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public String toString() {
        return String.valueOf(requestId);
    }
    
    
    
    
    
}
