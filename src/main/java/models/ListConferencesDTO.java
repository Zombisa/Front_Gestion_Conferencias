package models;

import java.util.List;

public class ListConferencesDTO {
    private int totalConferences;
    private List<Conference> conferences;

    public ListConferencesDTO() {}
    public ListConferencesDTO(int totalConferences, List<Conference> conferences) {

    }


    public int getTotalConferences() {
        return totalConferences;
    }
    public void setTotalConferences(int totalConferences) {this.totalConferences = totalConferences;}
    public List<Conference> getConferences() {
        return conferences;
    }
    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
    }

}
