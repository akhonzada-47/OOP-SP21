
package Activity3;

public class Point 
{
    private int x;
    private int y;
    
    public Point()
    {
        x=0;
        y=0;
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
    public int getX()
    {
    return x;
    }
    public int getY()
    {
    return y;
    }
    
    public void display()
    {
        System.out.println("\n\nx coordinate = "+x+"\n y coordinate = "+y);
    }
    public void movePoint(int a , int b)
    {
        x += a;
        y += b;
        System.out.println("\nx coordinate after moving = "+x+"\n y coordinate after moving = "+y);
    }
    
}
