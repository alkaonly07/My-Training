package day1.basicDataStructureAsinment;

public class InterestCalculator {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        double time = 2;
        System.out.println("Simple Interest: " + InterestCalculator.calculateSimpleInterest(principal, rate, time));
        System.out.println("Compound Interest: " + InterestCalculator.calculateCompoundInterest(principal, rate, time));
    }
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
}
