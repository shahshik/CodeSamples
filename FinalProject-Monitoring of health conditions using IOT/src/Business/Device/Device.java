/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Device;

import Business.EffectsOnBody.EffectsOnBody;
import Business.EffectsOnBody.EffectsOnBodyList;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author NARESH SHAH
 */
public class Device {
    
    private String mobileNo;
    private String IMEINo;
  
    //private int IMEINO2;
    private String modelNo;
    private String manufacturer;
    private double avgSAR;
    private double maxSAR;
    private int valueRF;
    private int simCard;
    private double callStartTime;
    private double callEndTime;
    private EffectsOnBodyList effectsOnBodyList;

    public Device() {
        effectsOnBodyList = new EffectsOnBodyList();
    } 
    
    public EffectsOnBodyList getEffectsOnBodyList() {
        return effectsOnBodyList;
    }

    public void setEffectsOnBodyList(EffectsOnBodyList effectsOnBodyList) {
        this.effectsOnBodyList = effectsOnBodyList;
    }
   
    
    
    public double getCallStartTime() {
        return callStartTime;
    }

    public void setCallStartTime(double callStartTime) {
        this.callStartTime = callStartTime;
    }

    public double getCallEndTime() {
        return callEndTime;
    }

    public void setCallEndTime(double callEndTime) {
        this.callEndTime = callEndTime;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getIMEINo() {
        return IMEINo;
    }

    public void setIMEINo(String IMEINo) {
        this.IMEINo = IMEINo;
    }

   
    
    

    

    

    public int getSimCard() {
        return simCard;
    }

    public void setSimCard(int simCard) {
        this.simCard = simCard;
    }
    
   

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getAvgSAR() {
        return avgSAR;
    }

    public void setAvgSAR(double avgSAR) {
        this.avgSAR = avgSAR;
    }

    public double getMaxSAR() {
        return maxSAR;
    }

    public void setMaxSAR(double maxSAR) {
        this.maxSAR = maxSAR;
    }

    public int getValueRF() {
        return valueRF;
    }

    public void setValueRF(int valueRF) {
        this.valueRF = valueRF;
    }
    
    @Override
    public String toString() {
        return IMEINo;
    }
    
}
