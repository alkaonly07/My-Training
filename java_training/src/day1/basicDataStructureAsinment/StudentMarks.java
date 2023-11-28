package day1.basicDataStructureAsinment;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = 3;
        int subjectCount = 3;

        int[][] studentMarks = new int[studentCount][subjectCount];

        // Accept marks for three students in three subjects
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < subjectCount; j++) {
                System.out.println("Enter marks for Student " + (i + 1) + " in Subject " + (j + 1) + ":");
                studentMarks[i][j] = scanner.nextInt();
            }
        }

        // Calculate and display total and average marks for each student
        for (int i = 0; i < studentCount; i++) {
            int totalMarks = 0;
            for (int j = 0; j < subjectCount; j++) {
                totalMarks += studentMarks[i][j];
            }
            double averageMarks = (double) totalMarks / subjectCount;
            System.out.println("Total marks for Student " + (i + 1) + ": " + totalMarks);
            System.out.println("Average marks for Student " + (i + 1) + ": " + averageMarks);
        }

        // Calculate and display total and average marks for each subject
        for (int j = 0; j < subjectCount; j++) {
            int totalSubjectMarks = 0;
            for (int i = 0; i < studentCount; i++) {
                totalSubjectMarks += studentMarks[i][j];
            }
            double averageSubjectMarks = (double) totalSubjectMarks / studentCount;
            System.out.println("Total marks for Subject " + (j + 1) + ": " + totalSubjectMarks);
            System.out.println("Average marks for Subject " + (j + 1) + ": " + averageSubjectMarks);
        }
    }
}
