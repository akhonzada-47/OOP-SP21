
package Assignment;
import java.util.Scanner;

public class Runner 
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        int num1= s.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2= s.nextInt();
        
        System.out.println("\nEnter (1) for sum \nEnter (2) for multiply \nEnter (3) for divide"
                + "\nEnter (4) for modulus \nEnter (5) for sin \nEnter (6) for cos \nEnter (7) for tan");
        
        int i = s.nextInt();

            switch(i)
            {
                case 1:
                    System.out.println("SUM = "+ Calculator.sum(num1,num2));
                  break;
                case 2:
                    System.out.println("PRODUCT = "+ Calculator.multiply(num1,num2));
                  break;
                case 3:
                    System.out.println("RESULT = "+ Calculator.divide(num1,num2));
                  break;
                case 4:
                    System.out.println("MODULUS = "+ Calculator.modulus(num1,num2));
                  break;
                case 5:
                    System.out.println(Calculator.sin(num1,num2));
                  break;
                case 6:
                    System.out.println(Calculator.cos(num1,num2));
                  break;
                case 7:
                    System.out.println(Calculator.tan(num1,num2));
                  break;


            }
    } 

}
