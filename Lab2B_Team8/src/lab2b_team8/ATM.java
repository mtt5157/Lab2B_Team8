/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2b_team8;

/**
 *
 * @author Graham
 */
public class ATM {
    private String date;
    private Bank Bank1;
    private Currency currency1;
    
    public ATM(Bank Bank1){
        this.Bank1 = Bank1;
        this.currency1 = new Currency("USD");
        this.date = "1/1/11";
    }
    
    public void Deposit(double deposit, int accountNumber, String accountType){
        if(accountType.equalsIgnoreCase("savings")){
            for(int i =0; i<Bank1.getSavingsList().size(); i++){
                if(Bank1.getSavingsList().get(i).getAccountNumber()==accountNumber){
                    currency1.acceptBills(deposit);
                    Bank1.getSavingsList().get(i).makeDeposit(deposit);  
                }
                else{
                    System.out.println("You did not enter a valid account number");
                }
            }
        }
        else if(accountType.equalsIgnoreCase("checking")){
            for(int i =0; i<Bank1.getCheckingList().size(); i++){
                if(Bank1.getCheckingList().get(i).getAccountNumber()==accountNumber){
                    currency1.acceptBills(deposit);
                    Bank1.getCheckingList().get(i).makeDeposit(deposit);
                }
                else{
                    System.out.println("You did not enter a valid account number");
                }
            }
        }
       
        
    }
    
     public void Withdrawl(double withdrawl, int accountNumber, String accountType){
        if(accountType.equalsIgnoreCase("savings")){
            for(int i =0; i<Bank1.getSavingsList().size(); i++){
                if(Bank1.getSavingsList().get(i).getAccountNumber()==accountNumber){
                    currency1.vendBills(withdrawl);
                    Bank1.getSavingsList().get(i).makeWithdrawal(withdrawl);  
                }
                else{
                    System.out.println("You did not enter a valid account number");
                }
            }
        }
        else if(accountType.equalsIgnoreCase("checking")){
            for(int i =0; i<Bank1.getCheckingList().size(); i++){
                if(Bank1.getCheckingList().get(i).getAccountNumber()==accountNumber){
                    currency1.vendBills(withdrawl);
                    Bank1.getCheckingList().get(i).makeWithdrawal(withdrawl);
                }
                else{
                    System.out.println("You did not enter a valid account number");
                }
            }
        }
      
    }
    
}
