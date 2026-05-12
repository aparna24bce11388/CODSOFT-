
    public class Student {

        // Student attributes
        String name;
        int rollNumber;
        String grade;

        // Constructor
        Student(String name, int rollNumber, String grade) {

            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
        }

        // Display student details
        void displayStudent() {

            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

