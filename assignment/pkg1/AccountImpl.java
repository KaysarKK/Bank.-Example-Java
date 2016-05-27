/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author Kaisar Kassenov & Bakyt Nazirov
 */
public class AccountImpl implements Account {

    private long number;
    private int balance;
    
    public AccountImpl (long a, int b) {
        this.number = a;
        balance = b;
    }
    
    public long getAccountNumber() {
        return number;
    }
    
    public int getAccountBalance() {
        return balance;
    }
    
    public void changeBalance(int value) {
        balance = value;
    }
    
    @Override
    public void withdrawAccount(int value) throws Exception {
     balance = getAccountBalance();
     if (balance < value)
         throw new Exception("Not enough money");
     else
         balance -= value;
    }

    @Override
    public void monthlyAccrual() {
        
    }

    @Override
    public void depositAccount(int value) {
        balance += value;   
    }
    
}
