package CredentialGeneratorProject.main;

import CredentialGeneratorProject.model.Employee;
import CredentialGeneratorProject.service.Credentials;

import java.util.Scanner;

public class driver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-- Welcome to User Credentials generating Program --");
        System.out.print("\nEnter the firstname: ");
        String fName = scan.nextLine();

        System.out.print("\nEnter the Last name: ");
        String lName = scan.nextLine();
        
        Employee emp = new Employee(fName, lName);

        Credentials cs = new Credentials();

        System.out.println("Please enter the department from the following\n1: Technical\n2: Admin\n3: Human Resource\n4: Legal");
        int choice = scan.nextInt();

        // If conditions to call the appropriate method on choice
        if(choice == 1)
         {
             cs.showCredentials(emp, "Tech");
         }
         else if(choice == 2)
         {
             cs.showCredentials(emp, "Admin");
         }
         else if(choice == 3)
         {
             cs.showCredentials(emp, "hr");
         }
         else if(choice == 4)
         {
             cs.showCredentials(emp, "Legal");
         }
        

         scan.close();
    }    
}
