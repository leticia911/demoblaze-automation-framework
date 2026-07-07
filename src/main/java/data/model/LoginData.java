package data.model;

public class LoginData {

    private int id;
    private String username;
    private String password;
    private String role;
    private String status;
    private String language;
    private String environment;
    private String expectedResult;
    private String description;

    public LoginData() {
    }

    public LoginData(
            int id,
            String username,
            String password,
            String role,
            String status,
            String language,
            String environment,
            String expectedResult,
            String description) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
        this.language = language;
        this.environment = environment;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {

        return "LoginData{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", status='" + status + '\'' +
                ", environment='" + environment + '\'' +
                '}';

    }
}