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
public abstract class Customer {
    private int accountNumber;
    private String address;
    
    //I think we should have Customer be an abstract class but I put this in here in case we decide otherwise.
    /*
    public Customer(int newAccountNumber, String customerAddress){
        this.accountNumber = newAccountNumber;
        this.address = customerAddress;
             
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the checkingList
     */
   
    
    
    
    
}
