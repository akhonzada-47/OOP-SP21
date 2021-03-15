/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeactivities;

/**
 *
 * @author dell
 */
public class Activity2 
{
     public static void main(String[] args)
     {
         Account user1 = new Account();
         Account user2 = new Account(user1.getBalance());
         
         user1.deposit(1000);
         user1.withdraw(100);
         
         user2.deposit(1000);
         user2.withdraw(100);
         
         System.out.print("User1 available Balance is: " + user1.getBalance() + "\nUser2 available Balance is: " + user2.getBalance());
     }
    
    
}
