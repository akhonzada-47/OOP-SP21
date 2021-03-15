
package Activity2;

public class Activity2 
{
    public static void main(String[] args)
    {
        CalArea rect1 = new CalArea();
        System.out.print("Rect1 = " + rect1.Calculatearea());
        
        CalArea rect2 = new CalArea(5,6);
        System.out.print("\nRect2 = " + rect2.Calculatearea());
        
    }
    
}
