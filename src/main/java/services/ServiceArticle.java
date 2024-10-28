/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import models.Article;
import models.ListArticleAuthorDTO;
import models.ListArticleConferencesDTO;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 *
 * @author isabe
 */
public class ServiceArticle {
    private String endPoint;
    private Client client;

    public ServiceArticle() {
        this.endPoint = "http://localhost:8081/api/articles";
        client = ClientBuilder.newClient().register(new JacksonFeature());
    }

    // POST /api/articles/conference/{idConference}
    public Article addArticleToConference(String idConference, Article article) {
        WebTarget target = client.target(this.endPoint + "/conference/" + idConference);
        Entity<Article> data = Entity.entity(article, MediaType.APPLICATION_JSON_TYPE);

        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).post(data);
        int status = response.getStatus() ;
 
        // Si el estado es 200 (OK), se extrae el body
        if (status == 200 || status ==201) {
            return response.readEntity(Article.class); // Lee el cuerpo como Article
        } else {
            throw new RuntimeException("Failed to add article to conference: " + response.getStatus());
        }
    }
    
    // GET /api/articles/conferences/{idConference}
    public ListArticleConferencesDTO listArticlesByConference(String idConference) {
        WebTarget target = client.target(this.endPoint + "/conferences/" + idConference);
        // Realiza la solicitud GET y obtiene la respuesta
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();

        // Si el estado es 200 (OK), se extrae el body
        if (response.getStatus() == 200) {
            return response.readEntity(new GenericType<ListArticleConferencesDTO>() {});
        } else {
            throw new RuntimeException("Failed to fetch articles for conference: " + response.getStatus());
        }
    }

    // GET /api/articles/author/{idAuthor}
    public ListArticleAuthorDTO listArticlesByAuthor(String idAuthor) {
        WebTarget target = client.target(this.endPoint + "/author/" + idAuthor);
        // Realiza la solicitud GET y obtiene la respuesta
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();

        // Si el estado es 200 (OK), se extrae el body
        if (response.getStatus() == 200) {
            return response.readEntity(new GenericType<ListArticleAuthorDTO>() {
            });
        } else {
            throw new RuntimeException("Failed to fetch articles by author: " + response.getStatus());
        }
    }

    // PUT /api/articles/{idArticle}
    public Article updateArticle(String idArticle, Article article) {
        WebTarget target = client.target(this.endPoint + "/" + idArticle);
        Entity<Article> data = Entity.entity(article, MediaType.APPLICATION_JSON_TYPE);

        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).put(data);

        // Si el estado es 200 (OK), se extrae el body
        if (response.getStatus() == 200) {
            return response.readEntity(Article.class); // Lee el cuerpo como Article
        } else {
            throw new RuntimeException("Failed to update article: " + response.getStatus());
        }
    }

    // DELETE /api/articles/{idArticle}
    public boolean deleteArticle(String idArticle) {
        WebTarget target = client.target(this.endPoint + "/" + idArticle);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).delete();

        // Verifica si el estado es 200 (OK)
        if (response.getStatus() == 200) {
            return true; // Eliminación exitosa
        } else {
            System.out.println("Error: " + response.getStatus() + " " + response.getStatusInfo());
            return false;
        }
    }
}

