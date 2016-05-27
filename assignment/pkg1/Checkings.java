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
class Checkings extends AccountImpl {

    private long number;
    private int checkingNum;
    
    public Checkings(long a, int b) {
        super(a, b);
        number = a;
        checkingNum = 0;
    }
    
    private int balance  = getAccountBalance();
    
    @Override
    public String toString(){
        return "After Checking function the balance on the account is " + getAccountBalance() +"\n";
    } 
    

    @Override
    public void withdrawAccount(int value) throws Exception {
        int a  = getAccountBalance();
            if (a < value)
            {
                throw new Exception("You do not have enough money");
            }
            else 
            {
                checkingNum++;
                if (checkingNum > 3)
                {
                    
                    a -= 0.1 * a;
                    a -= value;
                    
                }
                else {
                    a -= value;
                }
                changeBalance(a);
            }
    }

    @Override
    public void monthlyAccrual() {
        checkingNum = 0;
    }    
}
