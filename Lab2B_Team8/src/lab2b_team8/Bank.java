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
    
    public Bank(String newBankName, String bankAddress){
        this.bankName = newBankName;
        this.bankLocation = bankAddress;
        this.customerList = new ArrayList<Customer>();
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
}
