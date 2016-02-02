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
public class Bank {
    private String bankName;
    private String bankLocation;
    private ArrayList<Customer> customerList;
    private ArrayList<Checking> checkingList;
    private ArrayList<Savings> savingsList;
    
    public Bank(String newBankName, String bankAddress, ArrayList<Customer> custList, ArrayList<Checking> checkList, ArrayList<Savings> saveList){
        this.bankName = newBankName;
        this.bankLocation = bankAddress;
        this.customerList = custList;
        this.checkingList = checkList;
        this.savingsList =saveList;
    }

    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return the bankLocation
     */
    public String getBankLocation() {
        return bankLocation;
    }

    /**
     * @param bankLocation the bankLocation to set
     */
    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    /**
     * @return the customerList
     */
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * @param customerList the customerList to set
     */
    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public void addCustomer(Customer customerToAdd){
        this.customerList.add(customerToAdd);
    }
    
     public ArrayList<Checking> getCheckingList() {
        return checkingList;
    }

    /**
     * @param checkingList the checkingList to set
     */
    public void setCheckingList(ArrayList<Checking> checkingList) {
        this.checkingList = checkingList;
    }

    /**
     * @return the savingsList
     */
    public ArrayList<Savings> getSavingsList() {
        return savingsList;
    }

    /**
     * @param savingsList the savingsList to set
     */
    public void setSavingsList(ArrayList<Savings> savingsList) {
        this.savingsList = savingsList;
    }
    public void addCheckingAccount(Checking checkingAccountToAdd){
       getCheckingList().add(checkingAccountToAdd);
       
   }
   
   public void addSavingsAccount(Savings savingsAccountToAdd){
       getSavingsList().add(savingsAccountToAdd);
       
   }
}
