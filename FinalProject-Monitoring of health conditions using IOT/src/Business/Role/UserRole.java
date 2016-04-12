/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.UserOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.UserRole.UserWorkAreaJPanel;

/**
 *
 * @author NARESH SHAH
 */
public class UserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new UserWorkAreaJPanel(userProcessContainer,account,(UserOrganization)organization,enterprise); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return Role.RoleType.User.getValue();
    }

    
    
   

   
    
}
