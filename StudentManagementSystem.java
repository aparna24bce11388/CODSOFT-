
import java.util.ArrayList;
import java.util.Scanner;

    public class StudentManagementSystem {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // ArrayList to store students
            ArrayList<Student> students = new ArrayList<>();

            int choice;

            do {

                // Menu
                System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student");
                System.out.println("4. Remove Student");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                sc.nextLine();

                switch (choice) {

                    // Add Student
                    case 1:

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Roll Number: ");
                        int roll = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Grade: ");
                        String grade = sc.nextLine();

                        students.add(new Student(name, roll, grade));

                        System.out.println("Student Added Successfully!");

                        break;

                    // Display Students
                    case 2:

                        if (students.isEmpty()) {

                            System.out.println("No Students Found!");

                        } else {

                            for (Student s : students) {

                                s.displayStudent();

                                System.out.println("----------------");
                            }
                        }

                        break;

                    // Search Student
                    case 3:

                        System.out.print("Enter Roll Number to Search: ");

                        int searchRoll = sc.nextInt();

                        boolean found = false;

                        for (Student s : students) {

                            if (s.rollNumber == searchRoll) {

                                s.displayStudent();

                                found = true;
                            }
                        }

                        if (!found) {

                            System.out.println("Student Not Found!");
                        }

                        break;

                    // Remove Student
                    case 4:

                        System.out.print("Enter Roll Number to Remove: ");

                        int removeRoll = sc.nextInt();

                        boolean removed = students.removeIf(s -> s.rollNumber == removeRoll);

                        if (removed) {

                            System.out.println("Student Removed Successfully!");

                        } else {

                            System.out.println("Student Not Found!");
                        }

                        break;

                    // Exit
                    case 5:

                        System.out.println("Exiting Program...");

                        break;

                    default:

                        System.out.println("Invalid Choice!");
                }

            } while (choice != 5);

            sc.close();
        }
    }

