import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        double[] marks = new double[numSubjects];
        double totalMarks = 0;

       
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        double averagePercentage = totalMarks / numSubjects;

     
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if (averagePercentage >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}