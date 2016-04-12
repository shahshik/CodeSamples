/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VendorRole;
import java.util.ArrayList;

/**
 *
 * @author NARESH SHAH
 */
public class ManufacturerOrganization extends Organization {

    public ManufacturerOrganization() {
        super(Type.Vendor.getValue());
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VendorRole());
        return roles;
    }
    
}
