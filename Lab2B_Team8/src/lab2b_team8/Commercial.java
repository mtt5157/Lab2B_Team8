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
public class Commercial extends Customer{
    private String companyName;
    
    public Commercial(int accountNumber, String add, String newCompanyName){
        super.setAccountNumber(accountNumber);
        super.setAddress(add);
        this.companyName = newCompanyName;
        //implement code to set the accountNumber and address
    }
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String company) {
        companyName = company;
    }
}
