package day1.basicDataStructureAsinment;

import static day1.basicDataStructureAsinment.ArmstrongNumber.isArmstrong;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        ArmstrongNumbersInRange.findArmstrongInRange();
    }
    public static void findArmstrongInRange() {
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
}
