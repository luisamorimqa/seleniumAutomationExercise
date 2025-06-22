package dto;

public class UserDTO {

    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public void setFirstname(String value) {
        this.firstname = value;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname(String value) {
        this.lastname = value;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getPassword() {
        return this.password;
    }
}
