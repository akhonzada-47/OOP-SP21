
import java.util.Scanner;


public class Lab3HActivity1 
{
    
    
        
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t\t***) Without Aurguments (***");
        Circle cir1 = new Circle();
        cir1.circleCircm();
        
        
        System.out.println("\t\t***) Without Aurguments (***");
        System.out.print("Enter Radius of circle: ");
        double a = input.nextDouble();
        System.out.print("Enter value of 'Pi' : ");
        double b = input.nextDouble();          
        Circle cir2 = new Circle(a, b); 
        cir2.circleCircm();
    }
    
}
