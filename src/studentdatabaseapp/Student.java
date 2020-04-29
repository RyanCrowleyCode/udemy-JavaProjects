package studentdatabaseapp;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class Student {
    private String firstName;
    private String lastName;
    private UUID testingUUID;
    private int balance;
    private String gradeYear;
    private Set<String> enrolledCourses = new HashSet<>();



    public Student() {
        setStudentName();
        System.out.println(this.firstName + " " + this.lastName);

//        this.testingUUID = UUID.randomUUID();
//        System.out.println("UUID is: " + testingUUID);
//        System.out.println("FIRST 4 of UUID: " + testingUUID.toString().substring(0, 4));
    }

    public void changeGradeYear() {
        // Print out options
        System.out.println("\nWhat year is the student? " +
                "\n1. Freshman " +
                "\n2. Sophomore " +
                "\n3. Junior " +
                "\n4. Senior " );

        // Conditional logic based on user input to assign gradeYear


    }

    private void setStudentName() {
        Scanner in = new Scanner(System.in);
        // Ask for first name
        System.out.println("Student's first name: ");

        // Save result as this.firstName
        this.firstName = in.nextLine();

        // Ask for last name
        System.out.println("Student's last name: ");

        // Save result as this.LastName
        this.lastName = in.nextLine();
    }

}
