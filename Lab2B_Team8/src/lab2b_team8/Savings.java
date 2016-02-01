/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2b_team8;

/**
 *
 * @author Zack
 */
public class Savings extends Account{
    public Savings(int accountNum, double initialBalance){
        super.setAccountNumber(accountNum);
        super.makeDeposit(initialBalance);
    }
    
}
