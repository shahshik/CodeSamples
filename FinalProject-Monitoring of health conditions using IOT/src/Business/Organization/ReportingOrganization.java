/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReportPublisherRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author NARESH SHAH
 */
public class ReportingOrganization extends Organization{

    public ReportingOrganization() {
        super(Type.ReportPublisher.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ReportPublisherRole());
        return roles;
    }
     
}


