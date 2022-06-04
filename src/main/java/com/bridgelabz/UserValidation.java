package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public static void userFirstName() {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.next();

        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        if(result == true)
            System.out.println("First Name is Valid");
        else
            System.out.println("First Name is Invalid");
    }

    public static void userLastName() {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();

        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if(result == true)
            System.out.println("Last Name is Valid");
        else
            System.out.println("Last Name is Invalid");
    }




    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        userFirstName();
        userLastName();

    }
}