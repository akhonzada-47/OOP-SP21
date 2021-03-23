
package Lab5_Assignment;

public class Runner
{
    public static void main(String[] args)
    {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(30,6);
        
        f1.setA(25);
        f1.setB(5);
        
        f1.display();
        f2.display();
        
        System.out.println(f2.equals(30,6));
        
    }
}
