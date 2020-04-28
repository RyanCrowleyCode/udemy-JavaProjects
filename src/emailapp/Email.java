package emailapp;

import java.util.Scanner;

public class Email {

    private final String firstName;
    private final String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String altEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // call a method asking for the department - return the department
        this.department = setDepartment();

        // call a method that returns a random password
        changePassword(generateRandomPassword(10));

        // Combine elements to generate email
        String departmentSuffix = (department.length() > 0) ? department + ".": "";
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departmentSuffix + companySuffix;
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("New worker: " + getFullName() +". Department Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "sales"; }
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) {return "accounting";}
        else {return "";}
    }

    // Generate a random password
    private String generateRandomPassword(int passwordLength) {
        String passwordCharacters = "ABCDEFGHIJKLMNOPQRSTUWXYZ01234567890abcdefghijklmnopqrstuvwxyz!@#$%^&*";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            int index = (int)(passwordCharacters.length() * Math.random());
            password.append(passwordCharacters.charAt(index));
        }

        return password.toString();
    }


    // Password
    public void changePassword(String password) { this.password = password; }
    public String getPassword() { return password; }

    // Mailbox Capacity
    public int getMailboxCapacity() { return mailboxCapacity; }
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // Alternate Email
    public String getAltEmail() { return altEmail; }
    public void setAltEmail(String altEmail) { this.altEmail = altEmail; }

    // Full Name
    public String getFullName() { return firstName + " " + lastName; }

    // Email
    public String getEmail() {
        return email;
    }

    // Info
    public String showInfo() {
        return "DISPLAY NAME: " + getFullName() +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

}
