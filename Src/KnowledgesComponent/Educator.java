package KnowledgesComponent;

public class Educator {
    private String EDUCATOR_ID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String type;
    private String email;
    private String[] communicationChannels;
    private String linkToEducationalMaterial;
    private String linkToLesson;

    Educator(String EDUCATOR_ID, String firstName, String middleName, String lastName, String type,
             String email, String[] communicationChannels, String linkToEducationalMaterial,
             String linkToLesson){
        this.EDUCATOR_ID = EDUCATOR_ID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.type = type;
        this.email = email;
        this.communicationChannels = communicationChannels;
        this.linkToEducationalMaterial = linkToEducationalMaterial;
        this.linkToLesson = linkToLesson;
    }

    public String getEducatorID(){
        return EDUCATOR_ID;
    }
}
