package emailapp;

public class Email {

    private final String firstName;
    private final String lastName;
    private final String department;
    private final String company;
    private final String email;

    int mailboxCapacity;
    String password;
    String altEmail;

    public Email(String firstName, String lastName, String department, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.company = company;
        // TODO: generate an email as firstname.lastname@department.company.com
        this.email = String.format("%s.%s@%s.%s.com", firstName, lastName, department, company);

        // TODO: determine department (sales, development, etc.), if none leave blank

        // TODO: generate a random string for a password

    }


    // TODO: Have set methods to change the password, set the mailbox capacity, and define an alternate email address.

    // TODO: Have get methods to display the name, email, and mailbox capacity
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
