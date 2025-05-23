import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSubjects;
        double total = 0;

        System.out.print("Enter total number of semesters: ");
        numSubjects = scanner.nextInt();

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter grade for semester " + i + ": ");
            double grade = scanner.nextDouble();
            total += grade;
        }

        double average = total / numSubjects;
        System.out.println("Average: " + average);

        if (average >= 90) System.out.println("Grade: A");
        else if (average >= 80) System.out.println("Grade: B");
        else if (average >= 70) System.out.println("Grade: C");
        else if (average >= 60) System.out.println("Grade: D");
        else System.out.println("Grade: F");

        scanner.close();
    }
}
