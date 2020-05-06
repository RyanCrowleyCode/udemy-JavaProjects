package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many new students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int n = 0; n < students.length; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTution();
        }

        // Show student info
        for (int i = 0; i <students.length; i++) {
            System.out.println("\n");
            System.out.println(students[i].toString());
        }



    }
}
