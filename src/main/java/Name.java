public class Name {
    private String firstName;
    private String secondName;
    private String surname;

    public Name(String firstName, String secondName, String surname) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + " " + surname;
    }

}
