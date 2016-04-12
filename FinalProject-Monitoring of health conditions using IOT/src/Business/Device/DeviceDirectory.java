/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Device;

import java.util.ArrayList;

/**
 *
 * @author NARESH SHAH
 */
public class DeviceDirectory {
   private ArrayList<Device> deviceList;
   
   public DeviceDirectory() {
        deviceList = new ArrayList<>();
    }

    public ArrayList<Device> getDeviceList() {
        return deviceList;
    }
    
    public Device addDevice() {
        Device d = new Device();
        deviceList.add(d);
        return d;
    }
    
    public Device searchDevice(String deviceNum) {
        for (Device d : deviceList) {
            if (d.getMobileNo().equals(deviceNum)) {
                return d;
            }
        }
        return null;
    }
    
    public Device searchIMEI(String deviceNum1) {
        for (Device d : deviceList) {
            if (d.getIMEINo().equals(deviceNum1)) {
                return d;
            }
        }
        return null;
    }
   
}
