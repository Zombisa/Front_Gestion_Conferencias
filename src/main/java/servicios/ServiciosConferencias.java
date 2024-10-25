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
     this.endPoint="http://localhost:5000/api/conference";
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
		listaConference = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Conference>>() {});		
		return listaConference;
	}
   //POST conference
   public Conference registrarConferencia(Conference objConferenceRegistar)
	{
		Conference  objConference=null;
		WebTarget target = conference.target(this.endPoint);	    
	    Entity<Conference> data = Entity.entity(objConferenceRegistar, MediaType.APPLICATION_JSON_TYPE);
	    objConference = target.request(MediaType.APPLICATION_JSON_TYPE).post(data, Conference.class);		
		return objConference;
	}
   
   //PUT conference/id
   public Conference actualizarCliente(Conference objConferenceActualizar,Integer id)
	{
		Conference  objConference=null;		
		WebTarget target = conference.target(this.endPoint+"/"+id);	    
	    Entity<Conference> data = Entity.entity(objConferenceActualizar, MediaType.APPLICATION_JSON_TYPE);
	    objConference = target.request(MediaType.APPLICATION_JSON_TYPE).put(data, Conference.class);		
		return objConference;
	}
   //DeleteMapping
   public Boolean eliminarConference(Integer id)
	{
		Boolean bandera=false;
		WebTarget target = conference.target(this.endPoint+"/"+id);	    
		bandera = target.request(MediaType.APPLICATION_JSON_TYPE).delete(Boolean.class);
		return bandera;
	}
        
    
}
