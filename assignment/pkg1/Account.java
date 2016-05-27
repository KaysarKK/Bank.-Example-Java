/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author Kays
 */
public interface Account {
    /**
     * Adding money on the account
     * @param value - shows how much money you want to add
     */
    public void depositAccount(int value);
    
    /**
     * Withdrawing money from the account
     */
    public void withdrawAccount(int value) throws Exception;
    
    /**
     *  
     */
    public void monthlyAccrual();

    public long getAccountNumber();
    
}
