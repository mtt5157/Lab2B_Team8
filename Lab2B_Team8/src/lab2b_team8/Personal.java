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
public class Personal extends Customer{
   private String Name;
   
   public Personal(int accountNumber, String add, String newFirstName){
       super.setAccountNumber(accountNumber);
       super.setAddress(add);
       this.Name = newFirstName;
       //implement code to set the accountNumber and address
   }

    /**
     * @return the firstName
     */
    public String getName() {
        return Name;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setName(String n) {
        this.Name = n;
    }
}
