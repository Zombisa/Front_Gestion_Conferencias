package models;

public class Article {
    private String name;
    private final String idAuthor;
    private final String idConference;
    private String keyWords;
    private BasicDate publishDate;

    
    /**
     * @param name author name
     * @param idAuthor author id who upload the article
     * @param idConference conference id
     */
  
    
    public Article(String name, String idAuthor, String idConference, String keyWords, BasicDate publishDate) {
        this.name = name;
        this.idAuthor = idAuthor;
        this.idConference = idConference;
        this.keyWords = keyWords;
        this.publishDate = publishDate;
    }
    public Article copy(){
        return new Article(
                this.getName(),
                this.getIdAuthor(),
                this.getIdConference(),
                this.getKeyWords(),
                this.getPublishDate()
        );
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getIdAuthor() {return this.idAuthor;}
    public String getIdConference() {return idConference;}
    public String getKeyWords() {return keyWords;}
    public void setKeyWords(String keyWords) {this.keyWords = keyWords;}
    public BasicDate getPublishDate() {return publishDate;}
    public void setPublishDate(BasicDate publishDate) {this.publishDate = publishDate;}
}
