
import serviceFactory.ServiceFactory;
import services.ServiceArticle;
import services.ServiceConference;
import services.ServiceUser;
import views.VLogin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ServiceUser serviceUser = serviceFactory.getServiceUser();
        ServiceConference serviceConference = serviceFactory.getServiceConference();
        ServiceArticle serviceArticle = serviceFactory.getServiceArticle();
        
        VLogin VtnLogin = new VLogin(serviceUser);
        VtnLogin.setVisible(true);
    }
    
}
