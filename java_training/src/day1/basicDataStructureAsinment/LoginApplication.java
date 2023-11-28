package day1.basicDataStructureAsinment;

import java.util.Scanner;

public class LoginApplication {
    private static final String VALID_USER_ID = "user123";
    private static final String VALID_PASSWORD = "pass123";

    public static void main(String[] args) {
        login();
    }

    public static void login() {
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("Enter Login name: ");
            String userName = scanner.nextLine();
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (isValidLogin(userName, password)) {
                System.out.println("Welcome, " + userName);
                break;
            } else {
                attempts++;
                System.out.println("Invalid credentials. Attempts left: " + (3 - attempts));
            }
        }

        if (attempts == 3) {
            System.out.println("Contact Admin");
        }
    }

    public static boolean isValidLogin(String userName, String password) {
        return userName.equals(VALID_USER_ID) && password.equals(VALID_PASSWORD);
    }

}
