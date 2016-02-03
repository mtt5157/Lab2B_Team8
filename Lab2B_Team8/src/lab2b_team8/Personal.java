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
   private String name;
   
   public Personal(int accountNumber, String address, String newFirstName){
       super(accountNumber, address);
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
