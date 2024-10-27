/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceFactory;

import services.ServiceArticle;
import services.ServiceConference;
import services.ServiceUser;
/**
 *
 * @author isabe
 */
public class ServiceFactory implements IServiceFactory{
    private final ServiceArticle serviceArticle;
    private final ServiceConference serviceConference;
    private final ServiceUser serviceUser;
    private static ServiceFactory instance;

    public ServiceFactory() {
        // Inicializamos las instancias de los servicios directamente
        serviceArticle = new ServiceArticle();
        serviceConference = new ServiceConference();
        serviceUser = new ServiceUser();
    }

    /**
     * Patrón Singleton para Factory
     * @return Instancia única de ServiceFactoryArrayList
     */
    public static synchronized ServiceFactory getInstance() {
        if (instance == null) {
            instance = new ServiceFactory();
        }
        return instance;
    }

    /**
     * @return Instancia de ServiceArticle
     */
    @Override
    public ServiceArticle getServiceArticle() {
        return serviceArticle;
    }

    /**
     * @return Instancia de ServiceConference
     */
    @Override
    public ServiceConference getServiceConference() {
        return serviceConference;
    }

    /**
     * @return Instancia de ServiceUser
     */
    @Override
    public ServiceUser getServiceUser() {
        return serviceUser;
    }
}
