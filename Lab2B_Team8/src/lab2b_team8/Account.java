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
public abstract class Account {
    private int accountNumber;
    private double balance;
    
    /*
    public Account(int theAccountNumber, double setBalance){
        this.accountNumber = theAccountNumber;
        this.balance = setBalance;
    }
    */

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void makeDeposit(double depositAmmount){
        this.balance = this.balance + depositAmmount;
    }
    
    public void makeWithdrawl(double withdrawlAmmount){
        if(this.balance - withdrawlAmmount >= 0)
        {
            this.balance = this.balance - withdrawlAmmount;
        }else{
            System.out.println("Insufficent funds!!!!!!!!!!!!!!");
        }
    }
    
}
