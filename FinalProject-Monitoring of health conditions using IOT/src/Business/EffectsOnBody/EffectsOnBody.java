/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EffectsOnBody;

import Business.Doctor.DoctorDirectory;
import java.util.ArrayList;

/**
 *
 * @author NARESH SHAH
 */
public class EffectsOnBody {
    
    private String effectsOnOrgans;
    private String diseaseType;
    private DoctorDirectory doctorlist;
    
    public EffectsOnBody(){
        doctorlist = new DoctorDirectory();
    }
    public String getEffectsOnOrgans() {
        return effectsOnOrgans;
    }

    public void setEffectsOnOrgans(String effectsOnOrgans) {
        this.effectsOnOrgans = effectsOnOrgans;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    public DoctorDirectory getDoctorlist() {
        return doctorlist;
    }

    public void setDoctorlist(DoctorDirectory doctorlist) {
        this.doctorlist = doctorlist;
    }
    
    
    
    @Override
    public String toString() {
        return effectsOnOrgans; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
