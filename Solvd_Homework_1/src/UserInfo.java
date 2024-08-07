public class UserInfo {
    private String firstName;
    private String lastName;
    private String email;
    private String city;

    public UserInfo(String firstName, String lastName, String email, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
    }
    public void printInfo(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("City: " + city);
    }
}
