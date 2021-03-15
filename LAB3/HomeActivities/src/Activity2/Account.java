
package Activity2;

public class Account 
{
    double balance ;
    
    public Account(int b)
    {
        balance = b;
        System.out.println("\t\t***) With Aurguments (***");
        System.out.println("\nAvailabe Balace: "+ balance);
    }
    public Account()
    {
        balance = 5000;
        System.out.println("Availabe Balace: "+ balance);
    }
    
    
    
    
    
    void withdraw(int w)
    {
        balance -= w;
        System.out.println("Remaining Balace after transaction of '" + w + "' is: "+ balance);
    }
    void deposit (int d)
    {
        balance += d;
        System.out.println("Available Balace after deposit of '" + d + "' is: " + balance);
    }
    
    
}
