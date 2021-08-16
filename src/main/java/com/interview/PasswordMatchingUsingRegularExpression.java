package com.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 ^ represents starting character of the string.
(?=.*[0-9]) represents a digit must occur at least once.
(?=.*[a-z]) represents a lower case alphabet must occur at least once.
(?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
(?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
(?=\\S+$) white spaces don’t allowed in the entire string.
.{8, 20} represents at least 8 characters and at most 20 characters.
$ represents the end of the string.
* */
public class PasswordMatchingUsingRegularExpression {
    public static void main(String[] args) {

        // Test Case 1:
        String str1 = "Geeks@portal20";
        System.out.println(isValidPassword(str1));

        // Test Case 2:
        String str2 = "Geeksforgeeks";
        System.out.println(isValidPassword(str2));

        // Test Case 3:
        String str3 = "Geeks@ portal9";
        System.out.println(isValidPassword(str3));

        // Test Case 4:
        String str4 = "1234";
        System.out.println(isValidPassword(str4));

        // Test Case 5:
        String str5 = "Gfg@20";
        System.out.println(isValidPassword(str5));

        // Test Case 6:
        String str6 = "geeks@portal20";
        System.out.println(isValidPassword(str6));
    }

    public static boolean isValidPassword(String password) {
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        if(password == null){
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }
}
