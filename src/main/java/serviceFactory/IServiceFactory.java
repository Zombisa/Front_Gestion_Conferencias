/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package serviceFactory;

import services.ServiceArticle;
import services.ServiceConference;
import services.ServiceUser;
/**
 *
 * @author isabe
 */
public interface IServiceFactory {
    public ServiceArticle getServiceArticle();
    public ServiceConference getServiceConference();
    public ServiceUser getServiceUser();
}

