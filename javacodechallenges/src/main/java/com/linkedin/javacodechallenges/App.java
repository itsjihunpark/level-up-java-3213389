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
        // regex pattern matching implementation
        return password.length() >= 6
                && password.matches(".*\\d.*")
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*");
    }

    public static void runPasswordComplexityTest() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String userPassword = s.nextLine();
        System.out.println("Is the password complex? " + isPasswordComplex(userPassword));
    }

    public static void playDoubleOrNothing() {
        DoubleOrNothing game = new DoubleOrNothing();
        game.playGame();
    }

    public static double calculateWaterBill(double gallonUsage) {
        double baseCharge = 18.84;
        double extraCharge = 3.90;
        double numberOfGallonsInCCF = 748;
        double includedGallons = 2 * numberOfGallonsInCCF;
        if (gallonUsage <= includedGallons) {
            return baseCharge;
        } else {
            double extraGallonsUsed = gallonUsage - includedGallons;
            double extraAmountOwed = Math.ceil(extraGallonsUsed / numberOfGallonsInCCF) * 3.9;
            return baseCharge + extraAmountOwed;
        }
    }

    public static void runCalculateWaterBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you use this month");
        double usage = scanner.nextDouble();
        System.out.println("You water bill is " + calculateWaterBill(usage));
        scanner.close();
    }

    public static void modelPerson() {
        Person p1 = new Person("Jihun", "Park", 19);
        System.out.println(p1.introduction());
    }

    public static void main(String[] args) {
        // runPasswordComplexityTest();
        // playDoubleOrNothing();
        // runCalculateWaterBill();
        modelPerson();
    }
}
