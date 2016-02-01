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
public class Currency {
  private String currencyType;
  
  public Currency(String currencyType){
      this.currencyType= currencyType;
  }
  
  public void vendBills(double amount){
      System.out.println("Vending: $"+amount);
  }
  
  public void acceptBills (double amount){
      System.out.println("Accepted: $"+amount+" for deposit");
  }
  
  public void setCurrencyType(String type){
      this.currencyType = type;
  }
  
  public String getCurrencyType(){
      return this.currencyType;
  }
}
