/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeactivities;

public class Account
{
    private double balance;
    
    
    public Account()
    {
        balance = 10000;        
    }
    
    public Account(double a)
    {
        balance = a;
    }
    
    
    public void deposit(double d)
    {
        if(d>0)
        {
            balance += d;
        }
        else
        {
            System.out.print("Invalid");
        }
    }
    public void withdraw(double w)
    {
        if(w>0)
        {
            balance -= w;
        }
        else
        {
            System.out.print("Invalid");
        }
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    
}
