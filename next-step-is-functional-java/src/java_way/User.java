package java_way;

public class User {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final Boolean active;


    public User(int id, String firstName, String lastName, Boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
    }

    public Boolean getActive() {
        return active;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastName;
    }
}


