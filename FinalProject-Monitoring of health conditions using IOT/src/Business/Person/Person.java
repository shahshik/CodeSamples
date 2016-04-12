
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Device.Device;

/**
 *
 * @author raunak
 */
public class Person {
    
    private String name;
    private Device device;
    private int id;
    private static int count = 1;

    public Person() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
