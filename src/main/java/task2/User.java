package task2;

class User extends Person {
    private String login;
    private String password;
    private String email;

    public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password, String email) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println("User Info:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }
}