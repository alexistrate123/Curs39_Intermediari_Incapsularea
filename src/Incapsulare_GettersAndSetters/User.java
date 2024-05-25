package Incapsulare_GettersAndSetters;

public class User {
   private String username;
   private String password;

    public User(String username, String password) {
        verificaUsernameul(username);

        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        verificaUsernameul(username);

    }

    private void verificaUsernameul(String username) {
        if (username.length() >=  5) {
            this.username = username;
        } else {
            System.out.println("Username-ul trebuie sa aiba minim 5 caractere!");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
