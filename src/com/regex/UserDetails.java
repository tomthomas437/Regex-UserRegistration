package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	public String regex;

    public void firstName(String firstName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }

    public void lastName(String lastName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }
    
    public void emailId(String emailId) {
        regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }
    
    public void mobileNumber(String mobileNumber) {
        regex = "^(\\d{1,3}[- ]?){1}\\d{9,10}$";
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }
    
    public void password(String password) {
    	regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Sorry!! InValid Input");
        }
    }
}
