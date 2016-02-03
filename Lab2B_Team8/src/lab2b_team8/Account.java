/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2b_team8;

/**
 *
 * @author Zack
 */
public abstract class Account {
    private int accountNumber;
    private double balance;
    
    
    public Account(int accountNum, double balance){
        this.accountNumber = accountNum;
        this.balance = balance;
    }
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
    
    public void makeDeposit(double depositAmmount){
        this.balance = this.balance + depositAmmount;
        System.out.println("Your current balance is: " + this.balance);
    }
    
    public void makeWithdrawal(double withdrawalAmmount){
        if(this.balance - withdrawalAmmount >= 0)
        {
            this.balance = this.balance - withdrawalAmmount;
            System.out.println("Your current balance is: " + this.balance);
        }else{
            System.out.println("Insufficent funds!");
        }
    }
    
}
