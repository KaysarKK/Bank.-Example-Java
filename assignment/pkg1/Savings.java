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
public class Savings extends AccountImpl {
    
    private long number;
    private int interestRate;
   
    public Savings(long a, int b, int c) {
        super(a, b);
        number = a;
        this.interestRate = c;
    }
    
    
    
    @Override
    public void monthlyAccrual() {
        int a = getAccountBalance();
        int c = a * interestRate / 100;
        a += c;
        changeBalance(a);
    }
    
    @Override
    public String toString(){
            return "After Savings function the current balance is " + getAccountBalance()+" and the rate is " + interestRate+"\n";
    }
}
