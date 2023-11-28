package day1.basicDataStructureAsinment;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int armstrongNumber = 153;
        if (ArmstrongNumber.isArmstrong(armstrongNumber)) {
            System.out.println(armstrongNumber + " is an Armstrong number.");
        } else {
            System.out.println(armstrongNumber + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, 3);
            num /= 10;
        }
        return result == originalNum;
    }
}
