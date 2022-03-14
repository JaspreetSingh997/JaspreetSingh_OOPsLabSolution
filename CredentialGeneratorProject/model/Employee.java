package CredentialGeneratorProject.model;

public class Employee {
    private String firstname;
    private String Lastname;

    
    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        Lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstName() {
        return null;
    }

    public String getLastName() {
        return null;
    }

}