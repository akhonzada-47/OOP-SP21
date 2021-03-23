
package Lab5_Assignment;
import java.util.Scanner;

public class Fraction
{
    Scanner input = new Scanner(System.in);
    
    private int a;
    private int b;
    private int ratio;
    
    public Fraction()
    {
             
    }
    public Fraction(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public void setA(int a)
    {
        this.a = a;
    }
    public void setB(int b)
    {
        this.b = b;
    }
    
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
    public int getRatio()
    {
        return ratio;
    }
    
    public void display()
    {
        this.ratio = a/b;
        System.out.println("Ratio of "+ a +" and "+ b +" is: "+ this.ratio);
        
        
    }
    
    
    public String equals(int a, int b)
    {
        
        if(this.ratio == a/b)
            return "TRUE";
        else
            return "FALSE"; 
    }
    
    
}
