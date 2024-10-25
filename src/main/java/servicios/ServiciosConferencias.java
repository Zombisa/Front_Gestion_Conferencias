/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;
import java.util.Date;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jackson.JacksonFeature;

import models.Conference;
/**
 *
 * @author ismos
 */
public class ServiciosConferencias {
    private String endPoint;
    private Client conference;
    public ServiciosConferencias(){
     this.endPoint="http://localhost:8080/api/conference";
     conference = ClientBuilder.newClient().register(new JacksonFeature());
    }
    //GET conference/id
    public Conference consultarConferencia(Integer id)
	{
		Conference  objConference=null;
		
		WebTarget target = conference.target(this.endPoint+"/"+id);
		objConference = target.request(MediaType.APPLICATION_JSON_TYPE).get(Conference.class);
		return objConference;
	}
    
    //GET conference
   public List<Conference> listarConference()
	{
		List<Conference> listaConference=null;		
		WebTarget target = conference.target(this.endPoint);
		  // Realiza la solicitud GET y obtiene la respuesta
                Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();
    
    // Si el estado es 200 (OK), se extrae el body
    if (response.getStatus() == 200) {
        return response.readEntity(new GenericType<List<Conference>>() {}); // Extrae la lista de Conference
    } else {
        throw new RuntimeException("Failed to fetch conferences: " + response.getStatus());
    }
	}
   //POST conference
   public Conference registrarConferencia(Conference objConferenceRegistar)
	{
		Conference  objConference=null;
		WebTarget target = conference.target(this.endPoint);	    
	    Entity<Conference> data = Entity.entity(objConferenceRegistar, MediaType.APPLICATION_JSON_TYPE);
	    Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
                               .post(data);
    
    // Extrae el body si la respuesta fue exitosa
    if (response.getStatus() == 200) { 
        return response.readEntity(Conference.class); // Lee el cuerpo como Conference
    } else {
        // Maneja los errores en caso de una respuesta no satisfactoria
        throw new RuntimeException("Failed to create conference: " + response.getStatus());
    }
	}
   
   //PUT conference/id
   public Conference actualizarCliente(Conference objConferenceActualizar,Integer id)
	{
		Conference  objConference=null;		
		WebTarget target = conference.target(this.endPoint+"/"+id);	    
	   Entity<Conference> data = Entity.entity(objConferenceActualizar, MediaType.APPLICATION_JSON_TYPE);
    
    Response response = target.request(MediaType.APPLICATION_JSON_TYPE).put(data);
    
    if (response.getStatus() == 200) {
        return response.readEntity(Conference.class); // Lee el objeto actualizado
    } else {
        throw new RuntimeException("Failed to update conference: " + response.getStatus());
    }
        }
   //DeleteMapping
   public Boolean eliminarConference(Integer id)
	{
		Boolean bandera=false;
		WebTarget target = conference.target(this.endPoint+"/"+id);	    
		Response response = target.request(MediaType.APPLICATION_JSON_TYPE).delete();
		   // Verificar el código de estado
             if (response.getStatus() == 200) {
                // Si la respuesta es OK (200), intentamos leer el cuerpo como Boolean
                return response.readEntity(Boolean.class);
            } else {
                // Si no es 200, puedes manejar el error de acuerdo al código de estado
                System.out.println("Error: " + response.getStatus() + " " + response.getStatusInfo());
                return false; // Retornar false en caso de error o manejarlo de otra manera
            }
	}
        
    
}
