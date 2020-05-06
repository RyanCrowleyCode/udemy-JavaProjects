package studentdatabaseapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private final ArrayList<String> courses = new ArrayList<>();
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
                courses.add(course);
                tuitionBalance += costOfCourse;
            }
        } while (1 !=0);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTution() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        if (payment <= tuitionBalance) {
            tuitionBalance -= payment;
            System.out.println("You have paid $" + payment + ".");
        }
        else {
            System.out.println("Oops! Your payment value cannot exceed your tuition balance. You are attempting to make a payment of $" + payment + ".");
        }
        viewBalance();
    }

    // Show courses
    public String showCourses(){
        String formattedCourseList = "Enrolled Courses:";
        for (String course : courses) {
            formattedCourseList += "\n\t" + course;
        }
        return formattedCourseList;
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\n" + showCourses() +
                "\nBalance: $" + tuitionBalance;
    }

}
