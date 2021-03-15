
package Activity2;

public class Runner
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);
        
        System.out.println("width of Rectangle is " + rect.getWidth());
        System.out.println("length of Rectangle is "+ rect.getLength());
        System.out.println("Area of Rectangle is "+ rect.area());
    }
    
}
