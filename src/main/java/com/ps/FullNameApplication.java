package com.ps;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Full name Generator!");

        System.out.println("Please enter your name: ");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        //declare fullName:
        String fullName = "";

        //let's use the if statement to include only parts that have values

        if(!firstName.isEmpty()){
            fullName = firstName;
        }

        if(!middleName.isEmpty()){
           // fullName = firstName + " " + middleName;
            fullName = fullName +" "+ middleName;
        }

        if(!lastName.isEmpty()){
            //fullName = firstName + " " + middleName + " " + lastName;
            fullName = fullName + " " + lastName;
        }

        if(!suffix.isEmpty()){
            //fullName = firstName + " " + middleName + " " + lastName + ","+ suffix;
            fullName = fullName + ","+ suffix;
        }

        //System.out.println("You full name is: " + fullName);
        System.out.printf("Your Full name is %s!", fullName);

    }
}