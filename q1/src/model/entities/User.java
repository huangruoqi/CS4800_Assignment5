package model.entities;

public class User {
	private String username;
	private String password;

    private static User instance;
	private User () {}
    public static User getInstance() {
        return instance = instance == null ? new User() : instance;
    }

    @Override
    public String toString() {
        return String.format("%s:%s", username, password);
    }

    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
