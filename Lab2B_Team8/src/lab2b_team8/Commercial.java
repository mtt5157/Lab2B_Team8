/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2b_team8;

import java.util.ArrayList;

/**
 *
 * @author Graham
 */
public class Commercial extends Customer{
    private String companyName;
    
    public Commercial(int accountNumber, String add, String newCompanyName){
        super.setAccountNumber(accountNumber);
        super.setAddress(add);
        ArrayList<Checking> theCheckingList = new ArrayList<Checking>();
        ArrayList<Savings> theSavingsList = new ArrayList<Savings>();
        super.setCheckingList(theCheckingList);
        super.setSavingsList(theSavingsList);
        this.companyName = newCompanyName;
        //implement code to set the accountNumber and address
    }
    
    
    public void addCheckingAccount(Checking checkingAccountToAdd){
       super.getCheckingList().add(checkingAccountToAdd);
       
   }
   
   public void addSavingsAccount(Savings savingsAccountToAdd){
       super.getSavingsList().add(savingsAccountToAdd);
       
   }
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String company) {
        companyName = company;
    }
}
