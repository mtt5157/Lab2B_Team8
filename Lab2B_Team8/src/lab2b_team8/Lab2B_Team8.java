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
             in.nextLine();
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
             in.nextLine();
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
         else if (inputChoice == 2){
             System.out.print("Please enter your account number: ");
             int requestNumber = in.nextInt();
             for(int i = 0; i < checking.size(); i++){
                 if(requestNumber == checking.get(i).getAccountNumber()){
                     System.out.println("Would you like to: ");
                     System.out.println("0- Make a deposit");
                     System.out.println("1- Make a withdrawal");
                     int depositWithdrawalChoice = in.nextInt();
                     if(depositWithdrawalChoice == 0){
                        double accountBalance = checking.get(i).getBalance();
                        System.out.println("Current Balance: $" + accountBalance);
                        System.out.print("Please enter the ammount you would like to deposit: $");
                        double depositAmmount = in.nextDouble();
                        
                        checking.get(i).makeDeposit(depositAmmount);
                        
                     }
                     else if(depositWithdrawalChoice == 1){
                        double accountBalance = checking.get(i).getBalance();
                        System.out.println("Current Balance: $" + accountBalance);
                        System.out.print("Please enter the ammount you would like to withdrawal: $");
                        double withdrawalAmmount = in.nextDouble();
                        checking.get(i).makeWithdrawal(withdrawalAmmount);
                         
                     }
                     
                   
                 }
                 else if(requestNumber == savings.get(i).getAccountNumber()){
                     System.out.println("Would you like to: ");
                     System.out.println("0- Make a deposit");
                     System.out.println("1- Make a withdrawl");
                     int depositWithdwarlChoice = in.nextInt();
                     if(depositWithdwarlChoice == 0){
                        double accountBalance = savings.get(i).getBalance();
                        System.out.println("Current Balance: $" + accountBalance);
                        System.out.print("Please enter the ammount you would like to deposit: $");
                        double depositAmmount = in.nextDouble();
                        savings.get(i).makeDeposit(depositAmmount);
                        
                         
                     }
                     else if(depositWithdwarlChoice == 1){
                        double accountBalance = savings.get(i).getBalance();
                        System.out.println("Current Balance: $" + accountBalance);
                        System.out.print("Please enter the ammount you would like to withdrawal: $");
                        double withdrawalAmmount = in.nextDouble();
                        savings.get(i).makeWithdrawal(withdrawalAmmount);
                         
                     }
                     
                   
                 }
                 else {
                     System.out.println("Invalid account number!");
                 }
             }
             
             
             
             
         } else {
             System.out.println("Enter your account number:");
             int accNumber = in.nextInt();
             System.out.println("1 - Checking");
             System.out.println("2 - Savings");
             int accChoice = in.nextInt();
             if (accChoice == 1) {
                for (int i = 0; i < checking.size(); i++) {
                    if (accNumber == checking.get(i).getAccountNumber()) {
                       System.out.println("Select the action from the ATM:");
                       System.out.println("1 - Get Cash");
                       System.out.println("2 - Deposit Cash");
                       int atmSelection = in.nextInt();
                       if (atmSelection == 1) {
                           System.out.println("Current Balance: $" + checking.get(i).getBalance());
                           System.out.println("Enter the amount of cash you'd like to withdraw: ");
                           double amount = in.nextDouble();
                           bank1.getAtm().Withdrawl(amount, accNumber, "checking");
                       } else {
                           System.out.println("Current Balance: $" + checking.get(i).getBalance());
                           System.out.println("Enter the amount of cash you'd like to deposit: ");
                           double amount = in.nextDouble();
                           bank1.getAtm().Deposit(amount, accNumber, "checking");
                       }
                    }
                }
             } else if (accChoice == 2) {
                for (int i = 0; i < savings.size(); i++) {
                    if (accNumber == savings.get(i).getAccountNumber()) {
                       System.out.println("Select the action from the ATM:");
                       System.out.println("1 - Get Cash");
                       System.out.println("2 - Deposit Cash");
                       int atmSelection = in.nextInt();
                       if (atmSelection == 1) {
                           System.out.println("Current Balance: $" + savings.get(i).getBalance());
                           System.out.println("Enter the amount of cash you'd like to withdraw: ");
                           double amount = in.nextDouble();
                           bank1.getAtm().Withdrawl(amount, accNumber, "savings");
                       } else {
                           System.out.println("Current Balance: $" + savings.get(i).getBalance());
                           System.out.println("Enter the amount of cash you'd like to deposit: ");
                           double amount = in.nextDouble();
                           bank1.getAtm().Deposit(amount, accNumber, "savings");
                       }
                    }
                }
             }

         }
        }
     }
     
    }
    

