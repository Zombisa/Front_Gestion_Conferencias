
package models;


public class Conference {
    
    private String name;
    private BasicDate startDate;
    private BasicDate finishDate;
    private String place;
    private String topic;
    private String idConference;
    private String idOrganizer;
    private  boolean isOpen ;
    private String description;

    /**
     * 
     * @param name Conference name
     * @param startDate Started Date
     * @param finishDate End Date
     * @param place place of the conference
     * @param topic main topic of the conference
     * @param idConference id of the conference
     *
     */
    public Conference(String name, String description, BasicDate startDate,  BasicDate finishDate, String place, String topic, String idConference, String idOrganizer) {
        this.name = name;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.place = place;
        this.topic = topic;
        this.idConference = idConference;
        this.idOrganizer = idOrganizer;
        this.isOpen = true;
        this.description = description;
    }

    public Conference copy(){
        return new  Conference(
                this.getName(),
                this.getDescription(),
                this.getStartDate(),
                this.getFinishDate(),
                this.getPlace(),
                this.getTopic(),
                this.getIdConference(),
                this.getIdOrganizer()
        );
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BasicDate getStartDate() {
        return startDate;
    }
    public void setStartDate(BasicDate startDate) {
        this.startDate = startDate;
    }
    public BasicDate getFinishDate() {
        return finishDate;
    }
    public void setFinishDate(BasicDate finishDate) {
        this.finishDate = finishDate;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getIdConference() {
        return idConference;
    }
    public void setIdConference(String idConference) {
        this.idConference = idConference;
    }
    public boolean isOpen(){return this.isOpen;}
    public String getIdOrganizer() {
        return idOrganizer;
    }
    public void setIdOrganizer(String idOrganizer) {
        this.idOrganizer = idOrganizer;
    }
    public boolean setOpen(boolean open) {
        return this.isOpen = open;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) { this.description = description; }
}
