package com.bridgelabz.regex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
    public class UserInputValidation {

        public static boolean isValidFirstName(String firstName) {

            String firstNameRegex = "[A-Z]{1}[a-z]{2,}";  //Declaring regex pattern to check the firstName

            Pattern pattern = Pattern.compile(firstNameRegex);
            Matcher matcher = pattern.matcher(firstName);

            return matcher.matches();
        }
        public static boolean isValidLastName(String lastName) {
            String firstNameRegex = "[A-Z]{1}[a-z]{2,}";

            Pattern pattern = Pattern.compile(firstNameRegex);

            Matcher matcher = pattern.matcher(lastName);

            return matcher.matches();
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // Method To Check First Name With Regex Start With Cap And 3 Min. Character
            System.out.println("Enter the first Name: ");
            String firstName = scan.nextLine();
            System.out.println("Enter the last Name :");
            String lastName = scan.nextLine();

            if (Pattern.matches("^[A-Z][a-z]{2,}", firstName)) {
                System.out.println("First name is valid");
            } else {
                System.out.println("Entered first name is invalid");
            }
            scan.close();
            // Method To Check Last Name With Regex Start With Cap And 3 Min. Character
            if (Pattern.matches("^[A-Z][a-z]{2,}", lastName)) {
                System.out.println("Last name is valid");
            } else {
                System.out.println("Entered last name is invalid");
            }
        }
    }


