
package lab2h2b;

class Account 
{
     double balance;
    
    void setBalance(int a, double b)
    { 
        balance = b;
        System.out.print("***<   Object "+a+"   >***\n");
    }
    
    void showBalance()
    {
    System.out.println("Account Balance: $"+ balance);
    }
    
    void deposit()
    {
        int d = 1000;
        balance += d;
        System.out.println("Balance after deposit: $"+ balance);
    }
    
    void withdraw()
    {
        int w = 1000;
        balance -= w;
        System.out.println("Remaining Balance after transaction: $"+ balance+"\n\n\n");
    }
    

    
    
}
