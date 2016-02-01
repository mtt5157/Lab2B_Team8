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
public class Checking extends Account{
   
    
    public Checking(int accountNum, double initialBalance){
        super.makeDeposit(initialBalance);
       super.setAccountNumber(accountNum);
        
    }
    
    
    
}
