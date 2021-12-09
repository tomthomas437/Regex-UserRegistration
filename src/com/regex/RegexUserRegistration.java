package com.regex;

import java.util.Scanner;

public class RegexUserRegistration {

	Scanner scanner = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();

    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = scanner.next();
        userDetails.firstName(firstName);
    }

    public void userLastName() {
        System.out.println("Enter Your Last Name : ");
        String lastName = scanner.next();
        userDetails.lastName(lastName);
    }
    
    public void userEmailId() {
        System.out.println("Enter Your EmailId : ");
        String emailId = scanner.next();
        userDetails.emailId(emailId);
    }
    
    public void userMobileNumber() {
        System.out.println("Enter your MobileNumber");
        String mobileNumber = scanner.next();
        userDetails.mobileNumber(mobileNumber);
    }
    
    public void userPassword() {
        System.out.println("Enter your Password. (The password should contain atleast 1 numeric value and Upper case.");
        String password = scanner.next();
        userDetails.password(password);
    }
}
