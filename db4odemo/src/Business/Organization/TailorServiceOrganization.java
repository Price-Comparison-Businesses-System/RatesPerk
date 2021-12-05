/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

/**
 *
 * @author tarushukla
 */
public class TailorServiceOrganization extends Organization{
    
    public TailorServiceOrganization(String OrgName, String OrgAddress, String OrgCity, String OrgCountry, int OrgZipCode, String OrgEmail, String OrgPhone) {
        super(Organization.Type.TailorService.getValue(), OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
    }
    
}
