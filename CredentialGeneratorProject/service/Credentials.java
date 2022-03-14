package CredentialGeneratorProject.service;

import CredentialGeneratorProject.model.Employee;

import java.util.Random;

public class Credentials {
    // private String generateEmailAddress(Employee employee, String department) {
    //     return employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + department + "." + "abc.com";
    // }

    // private String generatePassword() {
    //     Random random = new Random();

    //     String password = "";
    //     for (int i = 0; i <= 7; i++) {
    //         password += (char) random.nextInt(32, 123);
    //     }
    //     return password;
    // }
    
    private String generatePassword() {
        int letters = 8;
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String splChars = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalLetters + lowerLetters + splChars + numbers;
        Random random = new Random();
        StringBuffer password = new StringBuffer(letters);
        //random.setSeed(123456789);
        
        for(int i = 0; i <= 6; i++)
        {
            password.insert(i, combinedChars.charAt(random.nextInt(combinedChars.length()))) ; 
        }
        password.insert(random.nextInt(password.length()), splChars.charAt(random.nextInt(splChars.length())));

        

        return password.toString();
    }

    private String generateEmailAddress(Employee emp, String department)
    {
        return emp.getFirstname().toLowerCase() + emp.getLastname().toLowerCase() + "@" + department + ".abc.com";
    }

    public void showCredentials(Employee emp, String department)
    {
        System.out.println("Dear " + emp.getFirstname() + ", Your generated credentials are as follows: ");
        System.out.println("Email Address --> " + this.generateEmailAddress(emp, department));
        System.out.print("\nYour Password --> ");
        System.out.print(this.generatePassword());
    }
}
