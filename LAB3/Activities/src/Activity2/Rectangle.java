
package Activity2;

public class Rectangle 
{
    
    private int length, width;
    
    public Rectangle()
    {
    length = 5; width = 2;
    }
    public Rectangle(int l, int w)
    {
    length = l; width = w;
    }
    
    
    public void setLength(int l) //sets the value of length
    {
    length = l;
    }
    public void setWidth(int w) //sets the value of width
    {
    width = w;
    }
    
    public int getLength() //gets the value of length
    {
    return length;
    }
    public int getWidth() //gets the value of width
    {
    return width;
    }
    public int area()
    {
    return (length*width);
    }

}
