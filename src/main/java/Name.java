public class Name {
    private String firstName;
    private String midlName;
    private String lastName;

    public Name(String firstName, String secondName, String surname) {
        this.firstName = firstName;
        this.midlName = secondName;
        this.lastName = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return midlName;
    }

    public String getSurname() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + midlName + " " + lastName;
    }

}
