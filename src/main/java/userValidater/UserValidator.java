package userValidater;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String First_Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Email_Address_Pattern = "^([_a-zA-Z0-9-]+(\\\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\\\.[a-zA-Z0-9-]+)*(\\\\.[a-zA-Z]{1,6}))?$";
    public boolean validateFirstName(String fname){
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        return pattern.matcher(fname).matches();
    }

    public boolean validateEmailAddress(String email){
        Pattern pattern = Pattern.compile(Email_Address_Pattern);
        return pattern.matcher(email).matches();
    }

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        return pattern.matcher(lname).matches();
    }
}
