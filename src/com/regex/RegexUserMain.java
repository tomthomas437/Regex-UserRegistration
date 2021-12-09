package com.regex;
import java.util.Scanner;

	public class RegexUserMain {
		 RegexUserRegistration regexUserRegistration = new RegexUserRegistration();
		    TestSampleEmail testSampleEmail = new TestSampleEmail();
		    Scanner scanner = new Scanner(System.in);

		    public void choice() {
		        while (true) {
		            System.out.println("Enter 1 To Check First Name\n"
		                             + "Enter 2 To Check Second Name\n"
		                             + "Enter 3 To Check EmailId\n"
		                             + "Enter 4 To Check Mobile Number\n"
		                             + "Enter 5 To Check Password\n"
		                             + "Enter 6 To test the sample EmailIds\n"
		                             + "Enter 0 To Exit");
		            int choice = scanner.nextInt();
		            switch (choice) {
		                case 1 :
		                    regexUserRegistration.userFirstName();
		                    break;
		                case 2 :
		                    regexUserRegistration.userLastName();
		                    break;
		                case 3 :
		                    regexUserRegistration.userEmailId();
		                    break;
		                case 4 :
		                    regexUserRegistration.userMobileNumber();
		                    break;
		                case 5 :
		                    regexUserRegistration.userPassword();
		                    break;
		                case 6 :
		                    sampleEmailIds();
		                    break;
		                case 0:
		                    System.exit(0);
		                    break;
		                default :
		                    System.out.println("Enter the wrong input \n Please enter the Correct input");
		                    continue;
		            }
		        }
		    }

		    public void sampleEmailIds() {
		        System.out.println("Enter 1 to Test Sample Emails");
		        int option = scanner.nextInt();
		        if (option == 1) {
		            testSampleEmail.testForValidEmails();
		            testSampleEmail.testForNonValidEmails();
		        } else {
		            System.out.println("Enter the wrong input \n Please enter the Correct input");
		        }
		    }

		    public static void main(String[] args) {
		        System.out.println("\n Welcome to the User Registration program by Regex \n");
		        RegexUserMain regexUserMain = new RegexUserMain();
		        regexUserMain.choice();
		        regexUserMain.scanner.close();
		    }
		}