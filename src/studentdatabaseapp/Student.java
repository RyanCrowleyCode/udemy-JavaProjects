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

    Scanner scanner = new Scanner(System.in);



    public Student() {
        setStudentName();
        changeGradeYear();

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
        int gradeYearChoice = scanner.nextInt();
        if (gradeYearChoice == 1) { this.gradeYear = "freshman"; }
        else if (gradeYearChoice == 2) { this.gradeYear = "sophomore"; }
        else if (gradeYearChoice == 3) { this.gradeYear = "junior"; }
        else { this.gradeYear = "senior"; }
    }

    private void setStudentName() {
        // Ask for first name
        System.out.println("Student's first name: ");

        // Save result as this.firstName
        this.firstName = scanner.nextLine();

        // Ask for last name
        System.out.println("Student's last name: ");

        // Save result as this.LastName
        this.lastName = scanner.nextLine();
    }

}
