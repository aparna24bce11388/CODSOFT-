
    import java.util.Scanner;

    public class GradeCalculator {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Input number of subjects
            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            int totalMarks = 0;

            // Input marks for each subject
            for (int i = 1; i <= subjects; i++) {

                System.out.print("Enter marks for Subject " + i + ": ");
                int marks = sc.nextInt();

                // Check valid marks
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    i--;
                    continue;
                }

                totalMarks += marks;
            }

            // Calculate average percentage
            double averagePercentage = (double) totalMarks / subjects;

            // Grade calculation
            char grade;

            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display result
            System.out.println("\n----- RESULT -----");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);

            sc.close();
        }
    }


