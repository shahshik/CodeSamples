/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import java.util.ArrayList;

/**
 *
 * @author NARESH SHAH
 */
public class DoctorDirectory {
  private ArrayList<Doctor> doctorList;
   
   public DoctorDirectory() {
        doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }
   
   public Doctor addDoctor() {
        Doctor d = new Doctor();
        doctorList.add(d);
        return d;
    }
   public Doctor searchDoctor(String doctor) {
        for (Doctor d : doctorList) {
            if (d.getDoctorName().equals(doctor)) {
                return d;
            }
        }
        return null;
    }
   
   public void deleteDoctor(Doctor doctor) {
        doctorList.remove(doctor);
    }
   
   
}
