package clases;

public class User {
    //region attributes/fields
    private String username;
    private String email;
    private String password;
//endregion

    //region Setters and getters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        validatepassword(password);
        this.password = password;
    }
    //endregion

    //region Constructor
    public User(String username, String email, String password) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("The username cannot null or blank");
        }
        if (email == null || email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException("The email cannot null or Blank and need contains @");
        }
        validatepassword(password);

        this.password = password;
        this.username = username;
        this.email = email;
    }

    //endregion
    @Override
    public String toString() {
        return this.username + this.email + this.password;
    }

    private void validatepassword(String password) {
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("The password cannot null or blank");
        }
        if (password.length() >= 8 && password.length() <= 15) {

        } else {
            throw new IllegalArgumentException("The password need min 8 characters and max 15");
        }

    }
}




