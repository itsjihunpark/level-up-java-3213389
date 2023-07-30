package com.linkedin.javacodechallenges;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {
    public static boolean isEven(int n) {
        // if mod of number is 0 then number is even
        // otherwise, number is odd
        return n % 2 == 0;
    }

    public static boolean isPasswordComplex(String password) {
        /*
         * if (password.length() < 6) {
         * return false;
         * }
         * boolean hasLowercaseLetter = false;
         * boolean hasUppecaseLetter = false;
         * boolean hasNumber = false;
         * 
         * for (int i = 0; i < password.length() || !hasLowercaseLetter &&
         * !hasUppecaseLetter && !hasNumber; i++) {
         * char current = password.charAt(i);
         * if (Character.isDigit(current)) {
         * hasNumber = true;
         * } else if (Character.isUpperCase(current)) {
         * hasUppecaseLetter = true;
         * } else if (Character.isLowerCase(current)) {
         * hasLowercaseLetter = true;
         * }
         * }
         * 
         * return hasNumber && hasLowercaseLetter && hasUppecaseLetter;
         */
        //regex pattern matching implementation
        return password.length() >=6 
            && password.matches(".*\\d.*")
            && password.matches(".*[A-Z].*")
            && password.matches(".*[a-z].*");
        }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String userPassword = s.nextLine();
        System.out.println("Is the password complex? " + isPasswordComplex(userPassword));

    }
}
