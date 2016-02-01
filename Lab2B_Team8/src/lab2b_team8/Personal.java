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
public class Personal extends Customer{
   private String name;
   
   public Personal(int accountNumber, String add, String newFirstName){
       super.setAccountNumber(accountNumber);
       super.setAddress(add);
       this.name = newFirstName;
       //implement code to set the accountNumber and address
   }
   
   
   

    /**
     * @return the firstName
     */
    public String getName() {
        return name;
    }

    
    public void setName(String n) {
        this.name = n;
    }
}
