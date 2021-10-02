package KnowledgesComponent;

public class Student {
    private String STUDENT_ID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthdate;
    private String mobileNumber;
    private String additionalMobileNumber;
    private String address;
    private String[] communicationChannels;

    Student(String STUDENT_ID, String firstName, String middleName, String lastName, String birthdate, String mobileNumber,
            String additionalMobileNumber, String address, String[] communicationChannels){
        this.STUDENT_ID = STUDENT_ID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.mobileNumber = mobileNumber;
        this.additionalMobileNumber = additionalMobileNumber;
        this.address = address;
        this.communicationChannels = communicationChannels;
    }

    public String getStudentID(){
        return STUDENT_ID;
    }

}

