
package Activity3;

import java.util.Scanner;


public class Activity3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t\t***) With Aurguments (***");
        System.out.print("Enter Feet: ");
        int f = input.nextInt();
        System.out.print("Enter Inches: ");
        int i = input.nextInt();
        Distance dis1 = new Distance(f,i);
        dis1.display();
        
        System.out.println("\n\n\t\t***) Without Aurguments (***\n");
        Distance dis2 = new Distance();
        dis2.display();
        
    
    }
}
