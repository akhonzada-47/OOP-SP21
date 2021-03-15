
package Activity2;

import java.util.Scanner;


public class Activity2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Account Balance: ");
        int a = input.nextInt();
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n");
        
        Account acc1 = new Account(a);
        System.out.print("Enter Deposit amouont: ");
        int b = input.nextInt();
        acc1.deposit(b);
        
        System.out.print("Enter Transaction amount: ");
        int c = input.nextInt();
        acc1.withdraw(c);
        

        System.out.println("\n\n\n\t\t***) Without Aurguments (***\n");
        Account acc2 = new Account();
        System.out.print("Enter Deposit amouont: ");
        int x = input.nextInt();
        acc2.deposit(x);
        
        System.out.print("Enter Transaction amount: ");
        int y = input.nextInt();
        acc2.withdraw(y);
        
    }
}
