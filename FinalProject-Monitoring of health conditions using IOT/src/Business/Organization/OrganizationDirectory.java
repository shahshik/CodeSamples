/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.User.getValue())){
            organization = new UserOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ReportPublisher.getValue())){
            organization = new ReportingOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.HealthAnalyst.getValue())){
            organization = new HealthOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Vendor.getValue())){
            organization = new ManufacturerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}