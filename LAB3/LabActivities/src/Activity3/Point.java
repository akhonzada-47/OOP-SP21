
package Activity3;

public class Point 
{
    private int x;
    private int y;
    
    public Point()
    {
        x=10;
        y=20;
    }
    public Point(int a, int b)
    {
        x=a;
        y=b;
    }
    public void setX(int a)
    {
        x=a;
    }
    public void setY(int b)
    {
        y=b;
    }
    public void display()
    {
        System.out.println("\nx coordinate = "+x+" \ny coordinate = "+y);
    }
    public void move(int a , int b)
    {
        x=x+a;
        y=y+b;
        System.out.println("\n\nx coordinate after moving = "+x+" \ny coordinate after moving = "+y);
    }
    
}
