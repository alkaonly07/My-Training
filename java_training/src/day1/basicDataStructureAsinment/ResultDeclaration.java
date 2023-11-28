package day1.basicDataStructureAsinment;

public class ResultDeclaration {
    public static void main(String[] args) {
        int subject1 = 70;
        int subject2 = 80;
        int subject3 = 90;
        System.out.println("Result: " + ResultDeclaration.declareResult(subject1, subject2, subject3));
    }
    public static String declareResult(int subject1, int subject2, int subject3) {
        if (subject1 > 60 && subject2 > 60 && subject3 > 60) {
            return "Passed";
        } else if (subject1 > 60 || subject2 > 60 || subject3 > 60) {
            return "Promoted";
        } else {
            return "Failed";
        }
    }
}
