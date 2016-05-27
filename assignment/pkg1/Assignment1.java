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
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank b = new Bank();
        
        
        
        try {
            b.Credit2(16, 1100);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        
        try {
            b.Savings2(13, 1550);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }                

        try {
            b.Checkings2(12);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }                

                       
        
        try {
            b.depositAccount(13,1000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            b.depositAccount(12,10000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }        
        
        try {
            b.withdrawAccount(13,1000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            b.withdrawAccount(13,100000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }        
        
        try {
            b.withdrawAccount(16,100);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(b);
        
        b.monthlyAccrual();
        
        System.out.println("After monthAccrual \n" + b);
        
    }
    
}
