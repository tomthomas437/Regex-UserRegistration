package junit.user;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionUserRegistration {

    public String regex;

    public boolean firstName(String firstName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean testFirstName(String firstName) throws InputInvalidException {
        try {
            if (!firstName(firstName)) {
                throw new InputInvalidException("Entered FirstName is Invalid\n" +
                        "First name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered FirstName is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
            e.printStackTrace();
        }
        return firstName(firstName);
    }

    public boolean lastName(String lastName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean testLastName(String lastName) throws InputInvalidException {
        try {
            if (!lastName(lastName)) {
                throw new InputInvalidException("Entered LastName is Invalid\n" +
                        "Last name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered LastName is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
            e.printStackTrace();
        }
        return lastName(lastName);
    }

    public boolean emailId(String emailIds) {
        regex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailIds);
        return matcher.matches();
    }

    public boolean testEmailId(String emailId) throws InputInvalidException {
        try {
            if (!emailId(emailId)) {
                throw new InputInvalidException("Entered EmailId is Invalid");
            } else {
                System.out.println("Entered EmailId is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return emailId(emailId);
    }

    public boolean mobileNumber(String mobileNumber) {
        regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public boolean testMobileNumber(String mobileNumber) throws InputInvalidException {
        try {
            if (!mobileNumber(mobileNumber)) {
                throw new InputInvalidException("Entered MobileNumber is Invalid\n" +
                        "Mobile Number Must Contain Country Code");
            } else {
                System.out.println("Entered MobileNumber is Valid\n");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return mobileNumber(mobileNumber);
    }

    public boolean password(String password) {
        regex = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    public boolean testPassword(String password) throws InputInvalidException {
        try {
            if (!password(password)) {
                throw new InputInvalidException("Entered Password is Invalid\n" +
                        "Password Must Contain at least\n" +
                        "one Uppercase, one Numeric, one Special Char\n" +
                        "and minimum 8 Characters ");
            } else {
                System.out.println("Entered Password is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return password(password);
    }
}
