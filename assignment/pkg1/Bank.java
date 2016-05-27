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
public class Bank {
    private Account[] Accounts;
    private int size;
    
    Bank() {
        Accounts = new Account[10];
        size = 0;
    }
    
    /**
     *
     * @param a - number
     * @param b - interest rate 
     * @throws Exception if it used or rate is less than 0
     */
    public void Savings2 (long a, int b) throws Exception {
        int k = 0;
        int c;
        for (int i = 0; i < size; i++) {
            if (a == Accounts[i].getAccountNumber()){
                k++;
            }
        }
        if (k != 0 || b < 0) {
            throw new Exception("This number is in database or the interest rate is negative");
        }
        else {
            Accounts[size] = new Savings(a, 0, b);
            size++;
        }
    }
    
    
    
    public void Credit2 (long a, int b) throws Exception {
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (a == Accounts[i].getAccountNumber()){
                k++;
            }
        }
        if (k != 0 || b < 0) {
            throw new Exception("This number is in database or the debit limit is negative");
        }
        else {
            Accounts[size] = new Credit(a, 0, b);
            size++;
        }
    }

    public void Checkings2 (long a) throws Exception {
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (a == Accounts[i].getAccountNumber()){
                k++;
            }
        }
        if (k != 0) {
            throw new Exception("This number is in database");
        }
        else {
            Accounts[size] = new Checkings(a, 0);
            size++;
        }
    }    
    public void depositAccount (long a, int b) throws Exception {
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (a == Accounts[i].getAccountNumber()){
                k++;
            }
        }
        if (k == 0 )
            throw new Exception("This number is not in database d");
        if (b < 0) {
            throw new Exception("the amount is negative d");
        }
        else {
            for (int i = 0; i < size; i++) {
                if (a == Accounts[i].getAccountNumber()) {
                    Accounts[i].depositAccount(b);
                }
            }
        }
    }
    public void withdrawAccount (int a, int b) throws Exception {
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (a == Accounts[i].getAccountNumber()){
                    Accounts[i].withdrawAccount(b);
                    k++;
            }
        }
                
        if (k == 0)
        throw new Exception("This number is not in database");    
        
        if (b < 0) {
            throw new Exception("the amount is negative");
        }
    }
    public void monthlyAccrual() {
        for (int i = 0; i < size; i++)
            Accounts[i].monthlyAccrual();
    }
    
    @Override
    public String toString(){
        String s = " ";
        for (int i = 0; i < size; i++){
            s += Accounts[i] + " ";
        }
        return s;
    }
}
