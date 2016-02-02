package lab2b_team8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evangentis
 */
public class Lab2B_Team8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Checking> checking = new ArrayList<>();
    ArrayList<Savings> savings = new ArrayList<>();
    Bank bank1 = new Bank("team 8 bank", "220 college ave", customers, checking, savings);
    int inputChoice = -1;
    while(inputChoice != 0){
      System.out.println("What would you like to do?");
      System.out.println("0- exit");
      System.out.println("1- create a new account");
      System.out.println("2- withdraw/deposit");
      System.out.println("3- access ATM");
      inputChoice = in.nextInt();
      if(inputChoice == 1){
         System.out.println("Enter 1 for personal account");
         System.out.println("Enter 2 for commercial account");
         int custSelection = in.nextInt();
         if(custSelection ==1){
             System.out.println("Please enter name:");
             String name = in.nextLine();
             in.nextLine();
             System.out.println("Enter desired account number: ");
             int accountNum = in.nextInt();
             System.out.println("Enter address:");
             String address = in.nextLine();
             customers.add(new Personal(accountNum, address, name));
             System.out.println("Enter 1 for checking account");
             System.out.println("Enter 2 for savings account");
             int accountType = in.nextInt();
             if(accountType == 1){
               checking.add(new Checking(accountNum,0.0));  
             }
             else if(accountType == 2){
                 savings.add(new Savings(accountNum, 0.0));
             }
         }
         
         else if (custSelection == 2){
            System.out.println("Please enter company name:");
             String companyName = in.nextLine();
             in.nextLine();
             System.out.println("Enter desired account number: ");
             int accountNum = in.nextInt();
             System.out.println("Enter address:");
             String address = in.nextLine();
             customers.add(new Commercial(accountNum, address, companyName));
             System.out.println("Enter 1 for checking account");
             System.out.println("Enter 2 for savings account");
             int accountType = in.nextInt();
             if(accountType == 1){
               checking.add(new Checking(accountNum,0.0));  
             }
             else if(accountType == 2){
                 savings.add(new Savings(accountNum, 0.0));
             } 
         }
        }
     }
     
    }
    
}
