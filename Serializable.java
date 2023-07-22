import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters and setters
}
