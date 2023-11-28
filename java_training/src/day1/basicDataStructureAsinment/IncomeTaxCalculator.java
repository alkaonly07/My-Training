package day1.basicDataStructureAsinment;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CTC: ");
        double ctc = scanner.nextDouble();
        System.out.println("Income Tax Payable: " + IncomeTaxCalculator.calculateIncomeTax(ctc));
    }
    public static double calculateIncomeTax(double ctc) {
        if (ctc <= 180000) {
            return 0;
        } else if (ctc <= 300000) {
            return 0.1 * (ctc - 180000);
        } else if (ctc <= 500000) {
            return 0.1 * (300000 - 180000) + 0.2 * (ctc - 300000);
        } else {
            return 0.1 * (300000 - 180000) + 0.2 * (500000 - 300000) + 0.3 * (ctc - 500000);
        }
    }

}
