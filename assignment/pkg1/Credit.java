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
public class Credit extends AccountImpl {
    
    private long number;
    private int debtLimit;
    
    public Credit(long a, int b, int c) {
        super(a, b);
        number = a;;
        this.debtLimit = c;
    }
    
    private int balance = getAccountBalance();
    
    @Override   
    public void withdrawAccount(int value) throws Exception {
        
        if (balance - value < -debtLimit) {
            throw new Exception("You reached a peak of credit");
        }
        else
            balance -= value;
        changeBalance(balance);
    }
    
    @Override
    public void monthlyAccrual() {
        if (balance < 0 && balance > -debtLimit)
            balance += balance * 0.1;
        changeBalance(balance);
    }
    
    @Override
    public String toString(){
            return "After Credit function the current balance is " + getAccountBalance()+" and the limit is "+debtLimit+"\n";
    }
}
