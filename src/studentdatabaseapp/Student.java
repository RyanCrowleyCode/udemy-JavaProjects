package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println("\n" + firstName + " " + lastName + " (Grade Year: " + gradeYear + ") (Student ID: " + studentID +")\n");
    }

    // Generate an ID
    private void setStudentID() {
        // Every time we create a student ID, we increment the id by one (static id)
        id++;
        // Grade Level + ID
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits Q
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (course.equals("Q") || course.equals("q")) {
                break;
            }
            else {
                courses += "\n" + course;
                tuitionBalance += costOfCourse;
            }
        } while (1 !=0);

        System.out.println("\nENROLLED IN: " + courses);
        System.out.println("\nTUITION BALANCE: $" + tuitionBalance);
    }

    // View balance
    public void viewBalance() {
        System.out.println("\nYour balance is: $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTution() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        if (payment <= tuitionBalance) {
            tuitionBalance -= payment;
            System.out.println("\nYou have paid $" + payment + ".");
        }
        else {
            System.out.println("\nOops! Your payment value cannot exceed your tuition balance. You are attempting to make a payment of $" + payment + ".");
        }
        viewBalance();
    }

    // Show status

}
