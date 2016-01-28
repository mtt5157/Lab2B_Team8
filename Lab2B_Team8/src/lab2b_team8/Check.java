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
public class Check {
    private int accountNumber;
    private int checkNumber;
    private double checkAmmount;
    private String checkRecipient;
    
    public Check(int newAccountNumber, int theCheckNumber, double theCheckAmmount, String theCheckRecipient){
        this.accountNumber = newAccountNumber;
        this.checkNumber = theCheckNumber;
        this.checkAmmount = theCheckAmmount;
        this.checkRecipient = theCheckRecipient;
        
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
     * @return the checkNumber
     */
    public int getCheckNumber() {
        return checkNumber;
    }

    /**
     * @param checkNumber the checkNumber to set
     */
    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    /**
     * @return the checkAmmount
     */
    public double getCheckAmmount() {
        return checkAmmount;
    }

    /**
     * @param checkAmmount the checkAmmount to set
     */
    public void setCheckAmmount(double checkAmmount) {
        this.checkAmmount = checkAmmount;
    }

    /**
     * @return the checkRecipient
     */
    public String getCheckRecipient() {
        return checkRecipient;
    }

    /**
     * @param checkRecipient the checkRecipient to set
     */
    public void setCheckRecipient(String checkRecipient) {
        this.checkRecipient = checkRecipient;
    }
}
