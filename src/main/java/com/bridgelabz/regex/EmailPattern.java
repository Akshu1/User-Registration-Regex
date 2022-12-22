package com.bridgelabz.regex;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class EmailPattern {
    public boolean isValidEmail(String email) {

        //Regex to check first mandatory part i.e; abc, @, bridgelabz, ".", co and xyz and .in

        String emailRegex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@" +
                "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}" +
                "(?:(\\.([A-Za-z]{2})))?$";


        Pattern pattern = Pattern.compile(emailRegex);

        if (email == null)
            return false;

        return pattern.matcher(email).matches();
    }



    public static void main(String[] args) {
        // 1.Creating an Array list to store the email Addresses which need to be validated
        ArrayList<String> emailAddressList = new ArrayList<>();
        // 2.Adding the email addresses to list which need to be validated
        emailAddressList.add("abc@bridgelabz.co.in");
        emailAddressList.add("abc@yahoo.com");
        emailAddressList.add("abc-100@yahoo.com");
        emailAddressList.add("abc.100@yahoo.com");
        emailAddressList.add("abc111@abc.com");
        emailAddressList.add("abc-100@abc.net");
        emailAddressList.add("abc.100@abc.com.au");
        emailAddressList.add("abc@1.com");
        emailAddressList.add("abc@gmail.com.com");
        emailAddressList.add("abc+100@gmail.com");
        emailAddressList.add("abc");
        emailAddressList.add("abc@.com.my");
        emailAddressList.add("abc123@gmail.a");
        emailAddressList.add("abc123@.com");
        emailAddressList.add("abc123@.com.com");
        emailAddressList.add(".abc@abc.com");
        emailAddressList.add("abc()*@gmail.com");
        emailAddressList.add("abc@%*.com");
        emailAddressList.add("abc..2002@gmail.com");
        emailAddressList.add("abc.@gmail.com");
        emailAddressList.add("abc@abc@gmail..com");
        emailAddressList.add("abc@gmail.com.1a");
        emailAddressList.add("abc@gmail.com.aa.au");

        EmailPattern emailPatternValidationUtil = new EmailPattern();
        // 4.Iterating and printing valid message if the email addresses entered are valid
        for (String emailAddress : emailAddressList) {
            if (emailPatternValidationUtil.isValidEmail(emailAddress))
                System.out.println(emailAddress + " = Valid mail");
            else
                System.out.println(emailAddress + " = Invalid mail");
        }
    }

}